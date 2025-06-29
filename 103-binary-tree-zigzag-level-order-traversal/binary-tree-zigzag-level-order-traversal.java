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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int count = 0;
        List<List<Integer>> mlist = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return mlist;
         }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            count++;
            if(count % 2 == 0){
                Collections.reverse(list);
            }
            mlist.add(list);
        }
        
        return mlist;
    }
}