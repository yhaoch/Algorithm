/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    //这个题好帅
     // prev-->temp-->...--->....--->tail-->....
            // Delete @temp and insert to the next position of @tail
            // prev-->...-->...-->tail-->head-->...
            // Assign @temp to the next node of @prev
            // prev-->temp-->...-->tail-->...-->...
            // Keep doing until @tail is the next node of @prev
    public ListNode reverseKGroup(ListNode head, int k){
        if(head == null || head.next == null || k<2){
            return head;
        }   
        ListNode fhead = new ListNode(0);
        fhead.next = head;
        ListNode pre = fhead,tail = fhead,temp;
        int count = 0;
        while(true){
            count = k;
            while(count>0 && tail != null){
                count --;
                tail = tail.next;
            }
            if(tail == null)
                break;
            
            head = pre.next;
            while(pre.next != tail){
                temp = pre.next;
                pre.next = temp.next;
                
                temp.next = tail.next;
                tail.next = temp;
            }
            
            pre = head;
            tail = head;
        }
        return fhead.next;
    }
}