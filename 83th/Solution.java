/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //ListNode res = new ListNode(0);
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode current = head;
        ListNode ne;
        while(current !=null){
            //System.out.println(head.val + " " + current.val);
            ne = current.next;
            if(ne != null){
                //ne = current.next;
                if(current.val == ne.val)
                    current.next = ne.next;
                else{
                    current = ne;
                }
                //return deleteDuplicates(ne);
            }
            else{
                current = ne;
            }
        }
        return head;
    }
}
