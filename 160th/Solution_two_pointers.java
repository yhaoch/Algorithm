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
        if(headA == null || headB == null)
            return null;
        else{
            ListNode pointer1 = headA;
            ListNode pointer2 = headB;
            int count = 0;
            while(pointer1 != pointer2){
                if(pointer1 == null){
                    pointer1 = headB;
                    count ++;
                }
                else if(pointer2 == null){
                    pointer2 = headA;
                    count ++;
                }
                else if(count > 2)
                    return null;
                else{
                    pointer1 = pointer1.next;
                    pointer2 = pointer2.next;
                }
            }
            return pointer1;
        }
    }
}
