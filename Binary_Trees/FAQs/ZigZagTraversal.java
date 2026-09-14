//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        boolean l2r = true;

        while(!q.isEmpty()) {
            int size = q.size();

            List<Integer> row = new ArrayList<>(Collections.nCopies(size, 0));

            for(int i = 0; i < size; i++) {
                TreeNode curr = q.remove();

                int idx = l2r ? i : (size - 1 - i);

                row.set(idx, curr.data);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);

            }
            l2r = !l2r;
            ans.add(row);
        }
        return ans;
    }
}