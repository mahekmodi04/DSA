class Solution {
    public int removeDuplicates(int[] nums) {
        // toh unique value of index mei store hogi isliye no need to take 2 variables.

        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}