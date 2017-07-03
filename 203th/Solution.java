/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre;
        while(start != null && start.next != null){
            ListNode temp = start.next;
            if(temp.val == val){
                start.next = temp.next;
            }
            else{
            	start = start.next;
            }
            // else if(start.next == null){
            //     if(start.val == val){
            //         start = null;
            //         break;
            //     }
            //     else
            //         break;
            // }
        }
        return pre.next;
    }
}
