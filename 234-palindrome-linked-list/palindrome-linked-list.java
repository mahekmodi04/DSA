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
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return solve(head);
    }

    public boolean solve(ListNode head) {
        if(head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }
}