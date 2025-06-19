class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int maxsum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxsum= sum;
        int j = n-1;
        for(int i=0;i<k;i++){
            sum = sum + nums[j] - nums[k-i-1];
            maxsum = Math.max(sum,maxsum);
            j--;
        }
        return maxsum;
    }
}