class Solution {
    public int findDuplicate(int[] nums) {
        int n = 0;
        int cnt[] = new int[nums.length + 1];
        for(int i = 0;i<nums.length;i++){
            cnt[nums[i]]++;
            if(cnt[nums[i]] > 1){
                n = nums[i];
                break;
            }
        }
        return n;
    }
}