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
        ListNode temp = head;
        int count = 1;
        while(temp.next!= null){
            count++;
            temp = temp.next;
        }
        int k = 0;
        if(count %2 != 0){
            k = (count + 1)/2;
        }
        else{
            k = count/2 + 1;
        }
        temp = head;
        while(k > 1){
            temp = temp.next;
            k--;
        }
        return temp;
    }
}