//https://leetcode.com/problems/binary-tree-inorder-traversal/description/

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
    public void inOrder(TreeNode root, List<Integer> ans) {
        if(root == null) return;

        inOrder(root.left, ans);
        ans.add(root.data);
        inOrder(root.right, ans);
    }
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();

        inOrder(root, ans);

        return ans;
    }
}