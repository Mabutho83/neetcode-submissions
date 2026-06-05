/*
Intuition: 

*/
class Solution {
    public int maxArea(int[] heights) {
        int max_area = 0; 
        int left = 0; 
        int right = heights.length - 1; 

        while(left < right){
            if(heights[left] < heights[right]){
                max_area = Math.max(max_area, heights[left] * (right - left)); 
                left++; 
            }else{
                max_area = Math.max(max_area, heights[right] * (right -  left)); 
                right--; 
            }
        }
        return max_area; 
    }
}
