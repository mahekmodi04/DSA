class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(k == nums[i]){
                k++;
            }
            else{
                return k;
            }
        }
        return k;
    }
}