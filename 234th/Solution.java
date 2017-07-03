/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head, fast = head;
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        ListNode start = head;
        ListNode nstart = reverseList(mid);
        while(nstart!= null){
            if(start.val != nstart.val)
                return false;
            start = start.next;
            nstart = nstart.next;
        }
        return true;
    }
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
