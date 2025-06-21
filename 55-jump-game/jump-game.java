class Solution {
    public boolean canJump(int[] nums) {
        int maxindx = 0;
        int ind = 0;
        int i = 0;
        while(i<nums.length){
            if(i > maxindx){
                return false;
            }
            ind = i + nums[i];
            maxindx = Math.max(maxindx , ind);
            
            if(maxindx >= nums.length-1){
                return true;
            }
            
            i++;
        }
        return true;
    }
}