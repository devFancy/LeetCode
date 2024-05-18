/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return isBalanced(root, 0) != -1;
    }
    
    public int isBalanced(TreeNode root, int h) {
        if (root == null) return h;
        
        int left = isBalanced(root.left, h + 1);
        if (left == -1) return left;
        
        int right = isBalanced(root.right, h + 1);
        if (right == -1) return right;
        
        if (Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right);
        }
    }
}