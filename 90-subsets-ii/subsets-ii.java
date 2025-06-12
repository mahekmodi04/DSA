class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Set<List<Integer>> set = new HashSet<>();
       Arrays.sort(nums);
       int n = nums.length;
       int subsets  = 1<<n;
       for(int i=0;i<subsets;i++){
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            //check the ith bit is set or no;
            if((i & (1<<j)) != 0){
                list.add(nums[j]);
            }
        }
        //Collections.sort(list); 
        set.add(list);
       }
       List<List<Integer>> mlist = new ArrayList<>(set);
       return mlist;
    }
}