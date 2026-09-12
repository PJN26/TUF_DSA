//https://leetcode.com/problems/symmetric-tree/description/

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
    private boolean symmetry(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;

        if(left == null || right == null) return false;

        if(left.data != right.data) return false;

        return symmetry(left.left, right.right) && symmetry(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetry(root.left, root.right);
    }
}