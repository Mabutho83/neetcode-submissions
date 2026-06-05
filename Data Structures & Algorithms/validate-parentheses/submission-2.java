//Intuition
//<!-- Describe your first thoughts on how to solve this problem. -->

//<!-- Describe your approach to solving the problem. -->

//Complexity
//-Time complexity: 
//<!--  Add your time complexity here, e.g. $$O(n)$$-->
//Space Complexity: 
//<!-- Add your space complexity here, e.g. O(n)...-->
//Code
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()){
         if(c == '(' || c == '{' || c == '['){
            stack.push(c); 
         }   
         else{
            if(stack.isEmpty()) return false;

            if(c == ')' || c == '}' || c == ']'){
                char temp = stack.peek(); 
                if(temp == '(' && c == ')') stack.pop();
                else if(temp == '[' && c == ']') stack.pop();
                else if(temp == '{' && c == '}') stack.pop();
                else{
                    return false;
                }
            }
         }
        }

        return stack.isEmpty(); 
    }
}
