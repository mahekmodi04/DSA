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
        // ListNode temp = head;
        // ListNode prev = null;//instead of using extra space...we can use this 1-2-3-4-5
        // //we want to make it 5-4-3-2-1
        // //so we will take prev , front and temp as 3 nodes in consdieration..till we get null we will run this loop and we will assign front as our temp.next
        // while(temp != null){
        //     ListNode front = temp.next;
        //     temp.next = prev;//prev is declared null for the first node later it will incr to temp and 
        //     prev = temp;//we are moving -> to <- basically so temp.next instead of front it will point prev node 
        //     temp = front;
        //     //temp will incr to front 

        // }
        // return prev;// at the end head will become 1 and prev will be 5 so to get the whole ll we will return prev;

        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}