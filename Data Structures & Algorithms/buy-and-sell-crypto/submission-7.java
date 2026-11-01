class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxProfit = 0;
        int sell = 0;
        for (sell =0 ;sell < prices.length; sell++){

            maxProfit = Math.max(prices[sell] - prices[buy] , maxProfit);
            buy = Math.min(prices[buy],prices[sell]) == prices[sell]? sell : buy ;

        }

        return maxProfit;
    }
}
