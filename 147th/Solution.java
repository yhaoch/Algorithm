/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
		if( head == null ){
			return head;
		}
		
		ListNode helper = new ListNode(0); 
        //set a new starter
		ListNode cur = head; 
        //这个iteration的指针指向
		ListNode pre = helper; 
        //在pre和pre.next之间添加新的点
		ListNode next = null; 
        //将要添加点的地方
		
        
        //not the end of input list
		while( cur != null ){
			next = cur.next;
			//find the right place to insert
            //very cool here!!!!
			while( pre.next != null && pre.next.val < cur.val ){
				pre = pre.next;
			}
			//insert between pre and pre.next
			cur.next = pre.next;
			pre.next = cur;
			pre = helper;
			cur = next;
		}
		
		return helper.next;
	}
}