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
        if (root == null) return new ArrayList<>();

        int count = -1;
        List<List<Integer>> mainlist = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            count++;
            if(count % 2 != 0){//if index is odd then perform the reverse thing
                int start = 0;
                int end = list.size()-1;
                while(start <= end){
                    int temp = list.get(start);
                    list.set(start,list.get(end)); // in arraylist we have to set the value with <index ,    value> type and not just list.get(start) = list.get(end)
                    list.set(end, temp);
                    start ++;
                    end--;
                }
            }
            mainlist.add(list);//add it to mainlist after reversing
        }
        return mainlist;
    }
}