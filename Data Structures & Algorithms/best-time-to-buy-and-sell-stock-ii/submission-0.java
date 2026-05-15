class Solution {
    public int maxProfit(int[] prices) {
        
        int temp = prices[0];
        int total = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < temp){
               temp = prices[i];
            }
            if(prices[i] > temp){
                total += prices[i] - temp;
                temp = prices[i];
            }
        }
        return total;
    }
}