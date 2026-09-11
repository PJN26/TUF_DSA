//https://leetcode.com/problems/diameter-of-binary-tree/description/

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
    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        int[] diameter = new int[1];
        diameterHelper(root, diameter);
        return diameter[0];
    }

    public int diameterHelper(TreeNode root, int[] diameter) {
        if(root == null) return 0;

        int leftHeight = diameterHelper(root.left, diameter);
        int rightHeight = diameterHelper(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}