class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=1;
        int j = 0;
        while(j<n && i<=n){
            if(i == nums[j]){
                i++;
                j++;
            }
            else{
                if(nums[j] > i){
                    return i;
                }
                else{
                    j++;
                }
            }
        }
        return i;
    }
}