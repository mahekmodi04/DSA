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
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp =head;
        ListNode prev = null;
        while(temp != null){
            if(prev != null){
                if(temp.val == prev.val){
                    prev.next = temp.next;
                    temp = temp.next;
                }
                else{
                    prev = temp;
                    temp = temp.next;
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