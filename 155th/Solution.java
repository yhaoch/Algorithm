public class MinStack {
    List<Integer> st;
    int minmal = 0;
    /** initialize your data structure here. */
    public MinStack() {
        st = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public void pop() {
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        int minv = st.get(0);
        for(int i=0;i<st.size();i++){
            if(st.get(i) < minv)
                minv = st.get(i);
        }
        return minv;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */