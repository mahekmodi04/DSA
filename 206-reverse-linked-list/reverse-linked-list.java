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
    public ListNode reverseList(ListNode head) {//take all elements in arraylist and traverse the list from back to put it in the ll again 
    //u can use stack also instead of arraylsit 
        // ArrayList<Integer> list = new ArrayList<>();
        // ListNode temp = head;
        // while(temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }
        // temp = head;
        // int i = list.size()-1;
        // while(i>=0 && temp != null){
        //     temp.val = list.get(i);
        //     temp = temp.next;
        //     i--;
        // }
        // return head;

        //method II
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }
        return prev;
    }
}