class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;//always for zero
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int t=nums[i];
                nums[i] =nums[j];
                nums[j] =t;
                j++;
            }
        }
    }
}