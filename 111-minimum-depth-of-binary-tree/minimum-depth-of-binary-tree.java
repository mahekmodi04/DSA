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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int ld = minDepth(root.left);
        int rh = minDepth(root.right);
        
        if(ld == 0 || rh == 0){
            return ld + rh + 1;
        }
        return Math.min(ld , rh) + 1;
    }
}