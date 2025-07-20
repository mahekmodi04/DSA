class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int max = Integer.MIN_VALUE;
        //prefix
        for(int i=0;i<nums.length;i++){
            prod = prod * nums[i];

            if(max < prod){
                max = prod;
            }
            if(prod == 0){
                prod = 1;
            }
        }
        //suffix
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod = prod * nums[i];

            if(max < prod){
                max = prod;
            }
            if(prod == 0){
                prod = 1;
            }
        }
        return max;
        

    }
}