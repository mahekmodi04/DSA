class Solution {
    public int[] applyOperations(int[] nums) {
        //operations

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        //move zero to end
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
        return nums;
    }
}