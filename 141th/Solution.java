/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> st = new HashMap<>();
        while(head != null){
            if(st.keySet().contains(head) == true)
                return true;
            st.put(head,0);
            head = head.next;
        }
        return false;
    }
}
