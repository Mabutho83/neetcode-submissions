class Solution {
    public boolean isPalindrome(String s) {
        //lowercase everything first here
        //need to handle if it's a space, not letter char, 
        //
        String lowStr = s.toLowerCase(); 
        int start = 0; 
        int end = s.length()-1; 

        while(start < end){
            //if the current char is not a space and is a letter
            while(start < end && !alphaNum(lowStr.charAt(start))){
                start++;
            }
            while(end > start && !alphaNum(lowStr.charAt(end))){
                end--; 
            }
            if(lowStr.charAt(start) != lowStr.charAt(end)){
                return false;
            }
            start++;
            end--; 
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
