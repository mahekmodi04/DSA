class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        // boolean isduplicate = false;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return isduplicate;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}