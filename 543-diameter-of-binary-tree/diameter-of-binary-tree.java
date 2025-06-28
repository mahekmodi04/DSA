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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int ld = diameterOfBinaryTree(root.left);
        int lh = height(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int rh = height(root.right);
        int self = lh + rh ;

        return Math.max((Math.max(ld, rd)), self);

    }
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = height(node.left);
        int r = height(node.right);
        return Math.max(l,r) + 1;
    }
}