class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit = 0 ;
        int j = 0;
        int currentProfit = 0;
        int minPrice = 0;
        for ( int i = 1; i<prices.length ; i++){

            currentProfit = prices[i] - prices[j];
            maxprofit = Math.max(maxprofit,currentProfit);
            minPrice = Math.min(prices[i],prices[j]);

            if(minPrice == prices[i]){

                j = i;
            }
        }

        return maxprofit;
        
    }
}
