/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = head;
		ListNode cur = head.next;
		ListNode next = null;
		while(cur != null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		head.next = null;
		head = pre;
		return head;
    }
}
