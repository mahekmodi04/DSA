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
        //LENGTH
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            temp= temp.next;
            cnt++;
        }
        int target = (cnt / 2);
        temp = head;
        int i =0;
        while(temp != null && i <= target-1){
            temp = temp.next;
            i++;
        }
        return temp;
    }
}