class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyprice = prices[0];
        for(int i=1;i<prices.length;i++){
            int sellprice = prices[i];
            buyprice = Math.min(sellprice , buyprice);
            int profit = sellprice - buyprice;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}