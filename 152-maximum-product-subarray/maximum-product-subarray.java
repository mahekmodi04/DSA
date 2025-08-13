class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = Integer.MIN_VALUE;
        int prod = 1;
        int n = nums.length;
        int prefix[] = new int[n];
        for(int i=0;i<n;i++){
            prod = prod * nums[i];
            if(maxprod < prod){
                maxprod = prod;
            }
            if(prod == 0)prod = 1;
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod = prod * nums[i];
            if(maxprod < prod){
                maxprod = prod;
            }
            if(prod == 0)prod = 1;
        }
        return maxprod;
    }
}