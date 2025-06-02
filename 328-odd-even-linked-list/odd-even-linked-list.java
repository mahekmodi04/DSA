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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        
        ListNode oddhead= head;
        ListNode evenhead = head.next;
        ListNode forodd = head;
        ListNode foreven = head.next;
        while(foreven != null && foreven.next != null){
            forodd.next = forodd.next.next;
            forodd = forodd.next;
            foreven.next = foreven.next.next;
            foreven = foreven.next;
        }
        forodd.next = evenhead;

        return head;
    }
}