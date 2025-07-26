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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return null;
        if(k == 0){
            return head;
        }
        //length
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        temp = head;
        int target = k % cnt;
        if(target == 0){
            return head;
        }
        int i=1;
        while(i < cnt - target){
            temp = temp.next;
            i++;
        }
        ListNode newhead = temp.next;
        temp.next = null;

        temp = newhead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head = newhead;

        return head;
    }
}