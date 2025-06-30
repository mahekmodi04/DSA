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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode curr = q.poll();
                if(curr == null){
                    list.add(null);
                }
                else{
                    list.add(curr.val);
                    q.add(curr.left);
                    q.add(curr.right);
                }
                
            }
            int first = 0;
            int last = list.size()-1;
            while(first <= last){
                if(list.get(first) != list.get(last)){
                    return false;
                }
                first++;
                last--;
            }
        }
        return true;
    }
}