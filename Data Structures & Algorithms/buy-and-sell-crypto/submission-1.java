class Solution {
    public int maxProfit(int[] prices) {
        
    //     int maxi = 0;
    //     for(int i = 0; i < prices.length; i++){
    //         int tempMaxi = 0;

    //         for(int j = i+1; j < prices.length; j++){

    //             if(prices[j] > prices[i]){
    //                 int differ = prices[j] - prices[i];
    //                 tempMaxi = Math.max(differ,tempMaxi);
    //             }
                
    //         }

    //         maxi = Math.max(maxi,tempMaxi);
    //     }
    // return maxi;





        int maxi = 0;
        int temp = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < temp){
                temp = prices[i];
            }
            else if(prices[i] > temp){
                int differ = prices[i] - temp;
                maxi = Math.max(maxi,differ);
            }
        }
        return maxi;
    }
}
