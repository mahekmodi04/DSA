class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
                if(count > n/2){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}