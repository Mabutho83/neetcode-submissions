class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>(); 
        for(String s : tokens){
            if(!isOperand(s)){
                stack.push(s); 
            }
            else{
                
                if(s.equals("+")){
                    int temp = Integer.parseInt(stack.peek());
                    stack.pop(); 
                    int result = Integer.parseInt(stack.peek()) + temp; 
                    stack.pop(); 
                    stack.push(Integer.toString(result));  
                }
                else if(s.equals("-")){
                    int temp = Integer.parseInt(stack.peek());
                    stack.pop(); 
                    int result = Integer.parseInt(stack.peek()) - temp; 
                    stack.pop(); 
                    stack.push(Integer.toString(result));  
                }
                if(s.equals("*")){
                    int temp = Integer.parseInt(stack.peek());
                    stack.pop(); 
                    int result = Integer.parseInt(stack.peek()) * temp; 
                    stack.pop(); 
                    stack.push(Integer.toString(result));  
                }
                if(s.equals("/")){
                    int temp = Integer.parseInt(stack.peek());
                    stack.pop(); 
                    int result = Integer.parseInt(stack.peek()) / temp; 
                    stack.pop(); 
                    stack.push(Integer.toString(result));  
                }
            }

        }
        return Integer.parseInt(stack.peek()); 
    }
    public boolean isOperand(String s){
        if(s.equals("+")) return true; 
        else if(s.equals("-")) return true;
        else if(s.equals("/")) return true; 
        else if(s.equals("*")) return true; 
        else{return false;}
    }
}
