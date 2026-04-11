class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0; 

        int ptr1 = 0, ptr2 = 1; 
        int profitMax = 0;

        while(ptr2 < prices.length){
            if(prices[ptr2] > prices[ptr1]){
                int profit = prices[ptr2] - prices[ptr1];
                profitMax = Math.max(profit, profitMax);  
            }
            else ptr1 = ptr2;
            ptr2++;
        }
        return profitMax; 
    }
}
