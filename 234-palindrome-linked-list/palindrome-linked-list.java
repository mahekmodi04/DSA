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
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> stack = new Stack<>();
//         ListNode temp = head;
//         while(temp != null){
//             stack.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         while(temp!= null && !stack.isEmpty()){
//             if(stack.peek() == temp.val){
//                 stack.pop();
//                 temp = temp.next;
//             }
//             else{
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while(curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && curr.val == stack.pop()) {
            curr = curr.next;
        }
        return curr == null;
    }
}