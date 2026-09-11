//https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

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
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        maximumPathSumHelper(root, maxSum);
        return maxSum[0];
    }

    private int maximumPathSumHelper(TreeNode root, int[] maxSum) {
        if(root == null) return 0;

        int leftSum = Math.max(0, maximumPathSumHelper(root.left, maxSum));
        int rightSum = Math.max(0, maximumPathSumHelper(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], root.data + leftSum + rightSum);

        return Math.max(leftSum, rightSum) + root.data;
    }
}