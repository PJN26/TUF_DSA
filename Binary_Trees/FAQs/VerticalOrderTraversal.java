//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {

    static class Tuple {
        TreeNode node;
        int x;
        int y;

        Tuple(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0, 0));

        while(!q.isEmpty()) {
            Tuple tuple = q.remove();

            TreeNode node = tuple.node;
            int x = tuple.x;
            int y = tuple.y;

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).add(node.data);

            if(node.left != null) {
                q.add(new Tuple(node.left, x - 1, y + 1));
            }

            if(node.right != null) {
                q.add(new Tuple(node.right, x + 1, y + 1));
            }
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> yMap : map.values()) {
            List<Integer> col = new ArrayList<>();

            for(PriorityQueue<Integer> pq : yMap.values()) {
                while(!pq.isEmpty()) {
                    col.add(pq.remove());
                }
            }

            ans.add(col);
        }

        return ans;
    }   
}