class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[(i+1)%len]){
                cnt++;
            }
            if(cnt > 1)return false;
        }
        return true;
    }
}