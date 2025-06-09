class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> mainlist = new ArrayList<>();
        int subsets = 1<<n;

        for(int i=0;i<subsets;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1 << j)) != 0){
                    list.add(nums[j]);
                }
            }
            mainlist.add(list);
        }
        return mainlist;
    }
}