class Solution {
    public int maxProfit(int[] prices) {
        int max  = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            int sell = prices[i];
            buy = Math.min(sell , buy);
            int pro = sell - buy;
            if(max < pro){
                max = pro;
            } 
        }
        return max;
    }
}