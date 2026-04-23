class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break; //stores the first zero u get and break and start a new loop
            }
        }
        if(j==-1)return;

        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != 0){
                int t= nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
    }
}