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
        HashMap<ListNode, Integer> st = new HashMap<ListNode,Integer>();
        ListNode pointer = headA;
        while(pointer != null){
            st.put(pointer,0);
            pointer = pointer.next;
        }
        ListNode pointer1 = headB;
        while(pointer1 != null){
            if(st.keySet().contains(pointer1) == true)
                return pointer1;
            pointer1 = pointer1.next;
        }
        return null;
    }
}
