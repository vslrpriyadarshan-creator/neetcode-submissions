class Solution {
    public int maxProfit(int[] prices) {
        
        int sellDay = 0;
        int profit = 0;
        int minPrice = 0;

        for(sellDay = 1; sellDay< prices.length; sellDay++){

             profit = Math.max(profit, prices[sellDay]- prices[minPrice]);

             int min = Math.min(prices[minPrice],prices[sellDay]);

             if( min == prices[sellDay]) {minPrice = sellDay;}


        }
        System.out.println("buy :" + minPrice +" "+ "SellDay :" + sellDay);
        return profit;

    }
}
