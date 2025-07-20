class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyprice = prices[0];
        for(int i=1;i<prices.length;i++){
            int sell = prices[i];
            buyprice = Math.min(sell , buyprice);
            int profit = sell - buyprice;
            if(profit > max){
                max = profit;
            }
        }
        return max;
    }
}