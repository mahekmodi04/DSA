class MyStack {

    public MyStack() {
        
    }
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        swapQueues();
        return popped;
    }
    
    public int top() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int top = q1.remove();
        q2.add(top);
        swapQueues();
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
    private void swapQueues(){
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
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