class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // pointer to track position for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               // move i to next unique position
                nums[i] = nums[j]; // put the unique value at index i
            }
        }
        return i + 1; // total number of unique elements
    }
}
