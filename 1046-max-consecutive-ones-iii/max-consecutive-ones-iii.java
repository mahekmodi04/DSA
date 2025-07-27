class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int cnt = 0;
        int max = 0;
        int og = k;
        while(i<nums.length && j<nums.length){
            if(nums[j] == 1){
                cnt++;
                j++;
            }
            else{
                if(og > 0){
                    cnt++;
                    og--;
                    j++;
                }
                else{
                    if(nums[i] == 1){
                        i++;
                        cnt--;
                    }
                    else{
                        og++;
                        i++;
                        cnt--;
                    }
                }
            }
            if(cnt > max)max = cnt;
        }
        return max;
    }
}