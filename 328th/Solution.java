/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        // if (head != null) {
        //     ListNode odd = head, even = head.next, evenHead = even; 
        //     while (even != null && even.next != null) {
        //         odd.next = odd.next.next; 
        //         even.next = even.next.next; 
        //         odd = odd.next;
        //         even = even.next;
        //     }
        //     odd.next = evenHead; 
        // }
        // return head;
        if(head != null){
            ListNode odd = head;
            ListNode evenHeader = head.next;
            ListNode even = evenHeader;
            
            while(even != null && even.next != null){
                odd.next = odd.next.next;
                odd = odd.next;
                even.next = even.next.next;
                even = even.next;
            }
            odd.next = evenHeader;
        }
        return head;
    }
}