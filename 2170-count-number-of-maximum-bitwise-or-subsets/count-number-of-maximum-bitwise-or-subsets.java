class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int ors = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            ors |= nums[i];
        }
        
        int subsets = 1<<nums.length;
        
        for(int i=0;i<subsets;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i &(1<<j)) != 0){
                    list.add(nums[j]);
                }
            }
            int xor=0;
            for(int t =0;t<list.size();t++){
                xor |= list.get(t);
            }
            if(xor == ors)cnt++;
        }
        return cnt;
    }
}