class Solution {
    public boolean canJump(int[] nums) {
        int maxj = 0;
        for(int i=0;i<nums.length;i++){
            if(i > maxj){
                return false;
            }
            if(maxj >= nums.length-1){
                return true;
            }
            int range = i + nums[i];
            if(maxj < range){
                maxj = range;
            }
        }
        return true;
    }
}