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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        // ListNode temp1 = list1;
        // ListNode temp2 = list2;
        // ListNode prev = null;
        // while(temp1 != null && temp2 != null){
            
        //     if(temp1.val <= temp2.val){
        //         while(temp1.next.val < temp2.val){
        //             temp1 = temp1.next;
        //             prev = temp1;
        //         }
        //         ListNode t = temp2.next;
        //         temp2.next = temp1.next;
        //         temp1.next = temp2;
        //         temp1 = temp1.next;
        //         prev = temp1;
        //         temp2 = t;
        //     }
        //     else{
        //         ListNode t = temp2.next;
        //         temp2.next = temp1;
        //         prev.next = temp2;
        //         temp1 = temp1.next;
        //         prev = temp1;
        //         temp2 = t;

        //     }
        // }

        ListNode ans;
        if(list1.val <= list2.val){
            ans = list1;
            list1 = list1.next;
        }
        else{
            ans = list2;
            list2 = list2.next;
        }

        ListNode temp = ans;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next; 
        }
        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return ans;
    }
}