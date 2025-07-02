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
    int cnt = 0;
    int res = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
    public void inorder(TreeNode root, int k){
//inorder of BST will be asc sorted order..so instead of stroing and takng req k we will track a cnt variable and then whenver we take a var from recursive function we will incr the cnt and check if cnt == k return with that root.val
        if(root == null){
            return ;
        }
        inorder(root.left , k);
        cnt++;
        if(cnt ==k){
            res = root.val;
            return;
        }
        inorder(root.right ,k);
    }
}