class Solution {
    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        if(nums.length==1){
            return nums[0];
        }
        int maxsum = nums[0];

        for(int i=1;i<nums.length;i++){
            sum = Math.max(sum +nums[i] ,nums[i]);
            maxsum = Math.max(maxsum , sum);
        }
        // int n = nums.length;
        // int sum = nums[0];  // Initialize sum with first element
        // int maxsum = nums[0];  // Initialize maxsum with first element

        // for (int i = 1; i < n; i++) {  
        //     sum = Math.max(nums[i], sum + nums[i]);  // Either extend or start new subarray
        //     maxsum = Math.max(maxsum, sum);  // Update maxsum
        // }

         return maxsum;
    }
}
