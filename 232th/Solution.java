public class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new ArrayDeque<Integer>();
        stack2 = new ArrayDeque<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        this.stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = 0;
        if(this.stack1.isEmpty() == true && this.stack2.isEmpty() == true){
            System.out.println("Queue is empty, can not pop element.");
            System.exit(0);
        }
        else{
            if(this.stack2.isEmpty() == true){
                int temp = 0;
                while(!this.stack1.isEmpty()){
                    temp = this.stack1.pop();
                    this.stack2.push(temp);
                }
            }
            x = this.stack2.pop();
        }
        return x;
    }
    
    /** Get the front element. */
    public int peek() {
        int x = 0;
        if(this.stack1.isEmpty() == true && this.stack2.isEmpty() == true){
            System.out.println("Queue is empty, can not pop element.");
            System.exit(0);
        }
        else{
            if(this.stack2.isEmpty() == true){
                int temp = 0;
                while(!this.stack1.isEmpty()){
                    temp = this.stack1.pop();
                    this.stack2.push(temp);
                }
            }
            x = this.stack2.peek();
        }
        return x;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(this.stack1.isEmpty() == true && this.stack2.isEmpty() == true){
            return true;
        }
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
