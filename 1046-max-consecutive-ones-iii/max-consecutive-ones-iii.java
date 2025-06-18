class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int l=0;
        int r = 0;
        int count = 0;
        int max = 0;
        while( r <nums.length){
            if(nums[r] == 0){
                count++;
                
            }
            while(count > k){
                if(nums[l] == 0){
                    count--;
                }
                l++;
            }
            int len = r - l + 1;
            max = Math.max(len , max);
            r++;

        }
        return max;
    }
}