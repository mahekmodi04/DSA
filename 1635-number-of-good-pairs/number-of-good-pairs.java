class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // since 1 <= nums[i] <= 100
        int cnt = 0;

        for (int num : nums) {
            cnt += freq[num];  // all previous occurrences of num form good pairs with current
            freq[num]++;
        }

        return cnt;
    }
}
