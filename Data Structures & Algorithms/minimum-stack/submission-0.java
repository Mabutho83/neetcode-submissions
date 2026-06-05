class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_val = new Stack<>(); 
    public MinStack() {
    }
    
    public void push(int val) {
        if(min_val.isEmpty() || val <= min_val.peek()) min_val.push(val);
        stack.push(val); 
    }
    
    public void pop() {
        if(stack.peek().equals(min_val.peek())){
            min_val.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek(); 
    }
    
    public int getMin() {
        return min_val.peek();
    }
}
