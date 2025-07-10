class Solution {
    public int findDuplicate(int[] nums) {
        int n =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                n = nums[i];
                break;
            }
        }
        return n;
    }
}