class Solution {
    public int evalRPN(String[] tokens) {
        //iterate over all elements in the array
        Stack<Integer> operations = new Stack<>(); 
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){ 
                operations.push(Integer.parseInt(s));
            }
            else{
                if(operations.isEmpty()){
                    continue;
                }
                //take current top, store in temp, pop it
                //take next top, store in current. Now do the 
                //operation based on the operand
                int temp = operations.pop();
                int current = operations.pop(); 
                int result = 0;
                if(s.equals("+")){
                    result = current + temp; 
                    operations.push(result); 
                }
                else if(s.equals("-")){
                    result = current - temp; 
                    operations.push(result); 
                }
                else if(s.equals("*")){
                    result = current * temp; 
                    operations.push(result); 
                }
                else if(s.equals("/")){
                    result = current / temp; 
                    operations.push(result);
                }
            }
        }

        return operations.peek(); 
    }
}