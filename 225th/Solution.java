public class MyStack {
    Queue<Integer> st1;
    Queue<Integer> st2;

    /** Initialize your data structure here. */
    public MyStack() {
    	st1 = new LinkedList<>();
        st2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(st1.peek() == null)
            st1.add(x);
    	else{
            for(int i = st1.size()-1;i>=0;i--)
                st2.add(st1.poll());
            st1.add(x);
            for(int i = st2.size()-1;i>=0;i--)
                st1.add(st2.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(st1.isEmpty() == true){
            System.exit(0);
        }
        return st1.poll();
    }
    
    /** Get the top element. */
    public int top() {
        if(st1.isEmpty() == true){
            System.exit(0);
        }
        return st1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(st1.isEmpty() == true && st2.isEmpty() == true)
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
