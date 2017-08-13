/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        
        
        //使用两个指针，一个快，一个慢，然后让这两个指针距离为n。这样同时向后动，直到快指针到达最后
        //，慢指针所在的地方的下一个就是被删除的
        //initially fast and slow are pointing to start and "slow.next=head" will change the start.next to head 
        //(because at this time start,slow and fast all are pointing to the same node in the linked list).
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;
        //fast.next = head;
        //ListNode fast = head,slow = head;
        //int count = 1;
        for(int i = 1;i<=n+1;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //int move = count - n;
        //cur.next = head;
        if(slow.next != null)
            slow.next = slow.next.next;
        return start.next;
    }
}