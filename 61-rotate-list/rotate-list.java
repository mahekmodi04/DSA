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
        //FIND SIZE
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int size  = count;
        if(size == 0){
            return null;
        }
        if(size == 1){
            return head;
        }
        if(size == k){
            return head;
        }
        int num = k% size;
        if(num == 0){
            return head;
        }
        //num is from the end so i have find the num from the first 
        temp = head;
        int i=0;
        while(i < size - num-1){
            i++;
            temp = temp.next;
        }
        //breakpoint 
        ListNode temp2 = temp.next;
        temp.next  = null;

        ListNode temp1 = temp2;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = head;
        head = temp2;

        return head;
    }
}