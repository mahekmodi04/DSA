/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           hash.add(nums[i]);
        }

            ListNode temp = head;
            ListNode prev = null;
            while(temp != null ){
                if(hash.contains(temp.val)){
                    if(prev == null){
                        head = head.next;
                        temp=head;
                    }
                    else{
                        prev.next = temp.next;
                        temp = temp.next;
                        //prev = temp;
                    } 
                }
                else{
                    prev = temp;
                    temp = temp.next;
                    
                }
                
            }
        
        return head;
    }
}