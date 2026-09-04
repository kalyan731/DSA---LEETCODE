class MinStack {
    private Stack<int[]> s1;

    public MinStack() {
        s1 = new Stack<>();
        
    }
    
    public void push(int value) {
       int currentMin = s1.isEmpty() ? value : Math.min(value, s1.peek()[1]);
        s1.push(new int[]{value, currentMin});
    }
    
    public void pop() {
        s1.pop();
        
    }
    
    public int top() {
        return s1.peek()[0];
        
    }
    
    public int getMin() {
        return s1.peek()[1];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */