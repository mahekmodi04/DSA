class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int i = 0;
        while(i < n) {
            int sum = 0;
            int j = i;
            while(j < n) {
                sum += nums[j];
                if(sum == k) {
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
