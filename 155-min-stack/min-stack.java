class MinStack {

    public MinStack() {
        
    }
    Stack<Long> st = new Stack<>();
    long min = Long.MAX_VALUE;
    public void push(int val) {

        if(st.isEmpty()){
            min = val;
            st.push((long)val);
        }
        else{
            if(val < min){
                st.push(2L*val - min);
                min = val;
            }
            else{
                st.push((long)val);
            }
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            long n = st.pop();
            if(n < min){
                min = 2L* min - n;
            }
            if (st.isEmpty()) {
            min = Long.MAX_VALUE;
            }
        } 
        // else{
        //     min = Integer.MAX_VALUE;
        // }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        long n = st.peek();
        if(n < min){
            return (int)min;
        }
        return (int)n;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */