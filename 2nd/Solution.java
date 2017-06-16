
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1 != null && l2 != null){
    		//ListNode newListOne = reverse(l1);
    		//ListNode newListTwo = reverse(l2);
    		return addOp(l1,l2);
    	}
    	return null;
    }
    /*deal with the add operation*/
    public static ListNode addOp(ListNode list1, ListNode list2){
    	int carry = 0;
    	int initial = 0;
    	ListNode head = new ListNode(initial);
    	ListNode start = head;
    	while(true){
    		if(list1==null && list2 ==null){
    			//System.out.println("1");
    			if(carry != 0){
    				head.next = new ListNode(carry);
    				carry = 0;
    			}
    			else
    				break;
    		}
    		else if(list1 == null && list2 !=null){
    			//System.out.println("2");
    			int temp = (0 + carry + list2.val) % 10;
    			carry = (carry + 0 + list2.val) / 10;
    			list2 = list2.next;
    			head.next = new ListNode(temp);
    			head = head.next;
    		}
    		else if(list1 != null && list2 == null){
    			//System.out.println("3");
    			int temp = (list1.val + 0 + carry) % 10;
    			carry = (list1.val + carry + 0) / 10;
    			list1 = list1.next;
    			head.next = new ListNode(temp);
    			head = head.next;
    		}
    		else if(list1 != null && list2 != null){
    			//System.out.println("4");
    			int temp = (list1.val + carry + list2.val) % 10;
    			//System.out.println(temp);
    			carry = (list1.val + carry + list2.val) / 10;
    			//System.out.println(carry);
    			list1 = list1.next;
    			list2 = list2.next;
    			head.next = new ListNode(temp);
    			head = head.next;
    		}
    	}
    	//System.out.println(start.next);
    	return start.next;
    } 
	/*reverse single linked-list*/
    /*this problem does not need to compute the reverse problem*/
    public static ListNode reverse(ListNode head){
    	if(head == null){
    		return head;
    	}
    	else{
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
    //test some cases.
    public static void main(String args[]){
    	//(2 -> 4 -> 3) + (5 -> 6 -> 4)
    	ListNode head = new ListNode(0);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(4);
    	head.next.next.next = new ListNode(3);
    	head.next.next.next.next = null;
    	ListNode head2 = new ListNode(0);
    	head2.next = new ListNode(5);
    	head2.next.next = new ListNode(6);
    	head2.next.next.next = new ListNode(4);
    	head2.next.next.next.next = null;
    	//ListNode test = reverse(head2.next);
    	//System.out.println(head.next.next.equals(null));
    	ListNode ans = addTwoNumbers(head.next,head2.next);
    	//System.out.println(ans);
    	while(ans != null){
    		System.out.print(ans.val);
    		ans = ans.next;
    	}
    }
}