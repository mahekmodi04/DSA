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
    public static int height(TreeNode root){
        if(root == null) {
                return 0;
            }
                int leftheight = height(root.left);
                int rightheight = height(root.right);

                return Math.max(leftheight , rightheight) + 1;
            }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
                return 0;
            }
            int leftdiam = diameterOfBinaryTree(root.left);
            int leftheight = height(root.left);
            int rightdiam = diameterOfBinaryTree(root.right);
            int rightheight = height(root.right);

            int selfdiam = leftheight + rightheight;

            return Math.max(selfdiam, Math.max(rightdiam ,leftdiam));
    }
}