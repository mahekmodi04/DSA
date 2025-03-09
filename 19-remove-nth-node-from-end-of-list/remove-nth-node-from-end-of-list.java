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
        if(n==count) return head.next;
        for(int i=0;i<idx;i++){
            prev = temp;
            temp = temp.next;
        }
        if(prev!= null){
            prev.next = temp.next;
        }
        
        return head;
    }
}