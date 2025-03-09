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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int mid = 0;
        if(count %2 != 0){
            mid = (count+1)/2;
        }else{
            mid = (count)/2 + 1;
        }
        temp = head;
        ListNode prev = null;
        while(mid > 1){
            prev = temp;
            temp = temp.next;
            mid--;
        }
        prev.next = temp.next;
        return head;

    }
}