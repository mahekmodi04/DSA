class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int cnt = 0;
        int cnt0 = 0;
        int head = -1;
        int tail = 0;
        while(tail < n){
            while((head+1 < n) && (nums[head+1] == 1 || (nums[head+1] == 0 && cnt0 < k))){
                head++;
                if(nums[head] == 0){
                    cnt0++;
                    cnt++;
                }
                else{
                    cnt++;
                }
            }
            ans = Math.max(ans,cnt);
            
            if(tail > head){
                tail++;
                head = tail - 1;
            }
            
            else{
                if(nums[tail] == 0 ){
                    cnt0--;
                    cnt--;
                }
                else{
                    cnt--;
                }
                tail++;
                
            }
            
        }
        return ans;
    }
}