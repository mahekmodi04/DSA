class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        //int i=0;
       for(int i=0;i<n;i++){
            if(target==nums[i]){
                return i;
            }
            else{
                if(target < nums[i]){
                    return i;
                }
            }
        }
        return nums.length;
    }
}