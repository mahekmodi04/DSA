class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int cnt = 0;
        int head = -1;
        int tail = 0;
        while(tail < n){
            while((head+1 < n)&& nums[head+1] == 1){
                head++;
                cnt++;
            }
            max = Math.max(max , cnt);

            if(tail > head){
                tail++;
                head = tail - 1;
            }

            else{
                if(nums[tail] == 1)cnt--;
                tail++;
            }
        }
        return max;
    }
}