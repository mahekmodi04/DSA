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
    //boolean isbst = false;
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = inorder(root);
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i) >= ans.get(i+1)){
                return false;
            
            }
        }
        return true;
        
    }
    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(inorder(root.left));
        list.add(root.val);
        list.addAll(inorder(root.right));

        return list;
    }
}