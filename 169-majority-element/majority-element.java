class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cnt++;
                if(cnt > n/2)return nums[i-1];
            }
            else{
                if(cnt <= n/2)cnt = 1; 
            }  
            
        }
        return nums[n-1];
    }
}