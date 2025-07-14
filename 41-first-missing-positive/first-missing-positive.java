class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == k){
                k++;
                while(i < nums.length - 1 && nums[i] == nums[i+1]){
                    i++;
                }
            }
            else if(nums[i] != k && nums[i] > 0){
                return k;
            }
            else{
                continue;
            }
        }
        
        return k;
    }
}