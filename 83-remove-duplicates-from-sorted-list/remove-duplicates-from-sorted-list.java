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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        //ListNode prev = null;
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            //prev = temp;
            else{
                temp = temp.next;
            }  
        }
        // if(temp.val == prev.val){
        //     prev.next = null;
        // }
        return head;
    }
}