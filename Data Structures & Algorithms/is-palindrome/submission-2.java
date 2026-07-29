class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length()-1; 
        String low = s.toLowerCase(); 
        
        while(left < right){
            if(!isAlphaNumeric(low.charAt(left))) left++; 
            else if(!isAlphaNumeric(low.charAt(right))) right--; 

            else if(low.charAt(left) == (low.charAt(right))){
                left++; 
                right--; 
            }
            else{
                return false;
            }
        }
        return true;

    }
    public boolean isAlphaNumeric(char c){
        if(Character.isLetterOrDigit(c)){
            return true; 
        }
        return false;
    }
}