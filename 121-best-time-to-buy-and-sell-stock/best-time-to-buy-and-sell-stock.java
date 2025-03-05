class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyprice = prices[0];
        int profit = 0;
        int maxprofit = 0;
       for(int i=0;i<n;i++){
            int sellprice = prices[i];
            buyprice = Math.min(buyprice , sellprice);
            profit = sellprice - buyprice;
            maxprofit = Math.max(profit,maxprofit);
       }
       return maxprofit;
    }
    
}