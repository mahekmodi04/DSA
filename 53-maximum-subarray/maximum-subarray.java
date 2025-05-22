class Solution {
    public int maxSubArray(int[] nums) {

        // int n = nums.length;
        // int sum = nums[0];  // Initialize sum with first element
        // int maxsum = nums[0];  // Initialize maxsum with first element

        // for (int i = 1; i < n; i++) {  
        //     sum = Math.max(nums[i], sum + nums[i]);  // Either extend or start new subarray
        //     maxsum = Math.max(maxsum, sum);  // Update maxsum
        // }

        //  return maxsum;

        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            sum += nums[i];

            if(sum > maxsum){
                maxsum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
            
        }
        
        return maxsum;

    }
}
