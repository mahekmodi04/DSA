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
    public ListNode middleNode(ListNode head) {
        //SLOW - FAST APPROACH
        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast != null && fast.next!= null){
        //     fast = fast.next.next;
        //     slow = slow.next;

        // }
        // return slow;

        ListNode temp = head;
        int count=1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        int mid = 0;
        if(count % 2 == 0){
            mid = (count/2)+1;
        }
        else{
            mid = (count+1)/2;
        }
        
        temp = head;
        
        while(mid > 1){
            temp = temp.next;
            mid--;
        }
        return temp;
    }
}