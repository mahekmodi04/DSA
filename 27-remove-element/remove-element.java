class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int n = nums.length;

        while (j < n) {
            if (nums[j] == val) {
                i = j;
                while (i < n - 1) {
                    nums[i] = nums[i + 1]; // shift left
                    i++;
                }
                n--; // reduce effective size
                // don't increment j, need to check new nums[j] again
            } else {
                j++;
            }
        }

        return n; // new length
    }
}
