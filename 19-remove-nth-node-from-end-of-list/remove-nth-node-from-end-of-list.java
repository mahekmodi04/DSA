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
        
        //length
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        int tar = cnt - n;
        if(tar == 0){
            head = head.next;
            return head;
        }
        temp = head;
        int i=1;
        while(i < tar && temp != null){
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}