/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        PriorityQueue<ListNode> st = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){
                if(l1.val < l2.val)
                    return -1;
                else if(l1.val > l2.val)
                    return 1;
                else{
                    return 0;
                }
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                st.add(node);
            
        while(!st.isEmpty()){
            tail.next=st.poll();
            tail=tail.next;
            //每次取优先级最低的一个，加到st去，在取优先级最低的
            if (tail.next!=null)
                st.add(tail.next);
        }
        return dummy.next;
    }
}