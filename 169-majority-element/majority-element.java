class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int cnt= 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cnt++;
                if(cnt > n/2){
                    return nums[i];
                }
            }
            else{
                cnt = 1;
            }
            
        }
        return nums[n-1];
    }
}