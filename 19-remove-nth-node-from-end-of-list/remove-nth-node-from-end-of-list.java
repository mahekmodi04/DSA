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
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int sz = cnt;
        if(n==sz){
            head = head.next;
            return head;
        }
        temp = head;
        int i=0;
        while(i < sz-n-1){
            temp = temp.next;
            i++;
        }
        //  if(temp.next.next == null){
        //     temp.next = null;
        //     return head;
        // }
        temp.next = temp.next.next;
        return head;
    }
}