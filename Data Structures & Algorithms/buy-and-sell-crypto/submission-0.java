class Solution {
    public int maxProfit(int[] prices) {
        int slow = 0; 
        int fast = 1;
        int max = 0; 
        
        while(fast < prices.length){
            if(prices[slow] < prices[fast]){
                int profit = prices[fast] - prices[slow]; 
                max = Math.max(profit, max); 
            }
            else{
                slow = fast;  
            }
            fast++; 
        }
        return max; 
    }
}
