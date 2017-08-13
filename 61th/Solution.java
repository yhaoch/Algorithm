	/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode temp = head;
        int count = 1;
        // while(true){
        //     if(k>0){
        //         cur = cur.next;
        //         k--;
        //     }
        //     if(temp.next != null){
        //         temp = temp.next;
        //     }
        //     if(temp.next == null){
        //         break;
        //     }
        // }
        //把链表连城一个环
	    while (temp.next != null) {
	        temp = temp.next;
	        count++;
	    }
        // link the tail of the list with the head, make it a cycle. Then count to the rotate point and cut it.
        System.out.println(count);
        temp.next = head;
        
        //这里很漂亮
        for (int i = count - k % count; i > 1; i--)
		    head = head.next;
        
        // start.next = cur.next;
        // cur.next = null;
        // temp.next = head;
        // return start.next;
        temp = head.next;
	    head.next = null;

	    return temp;
    }
}