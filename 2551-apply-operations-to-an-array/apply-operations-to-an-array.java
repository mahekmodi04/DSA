class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2 * nums[i];
                nums[i+1] = 0;
            }
            else{
                continue;
            }
        }

        //move zeros to end
        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j==-1)return nums;

        int i = j+1;
        while(i < nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }

        return nums;
    }
}