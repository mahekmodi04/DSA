class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            int sell = prices[i];
            buy = Math.min(buy,sell);
            int profit = sell - buy;
            if(max < profit){
                max = profit;
            }
        }
        return max;
    }
}