class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cnt++;
            }
            else{
                if(cnt == 1)return nums[i-1];
                cnt = 1;
            }
        }
        return nums[nums.length-1];
    }
}