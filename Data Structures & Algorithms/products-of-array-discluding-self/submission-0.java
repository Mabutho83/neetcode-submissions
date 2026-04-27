class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length]; 
        for(int i = 0; i < nums.length; i++){ //iterate over all elements in array (O(n))
            int product = 1;    
            for(int j = 0; j < nums.length; j++){ //each element iterated , iterate again O(n)
                if(i != j){
                product *= nums[j]; 
                }
            }
            res[i] = product;
        }
        //this is a naive solution, that achieves O(n**2) time complexity
        
        return res;
    }
}  