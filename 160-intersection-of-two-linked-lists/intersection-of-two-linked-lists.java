/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode tempa = headA;
        while(tempa != null){
            if(!set.contains(tempa)){
                set.add(tempa);
            }
            tempa = tempa.next;
        }
        ListNode tempb = headB;
        while(tempb != null){
            if(set.contains(tempb)){
                return tempb;
            }
            tempb = tempb.next;
        }
        tempb = null;
        return tempb;
    }
}