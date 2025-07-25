class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]= new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }
            else{
                if(!map.containsKey(nums[i])){
                    map.put(nums[i] , i);
                }
            }
        }
        return ans;
    }
}