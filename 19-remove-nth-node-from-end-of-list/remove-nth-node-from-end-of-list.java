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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode prev = null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int idx = count - n;
        if(n==count) return head.next;// if no of elements and nth node to be from last is also same 
        //that means full empty node..in that case according to the test cases return head.next matlab
        //if [1,2,3,4] and n =4 then return [2,3,4] 
        for(int i=0;i<idx;i++){
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = temp.next;
        
        
        return head;
    }
}