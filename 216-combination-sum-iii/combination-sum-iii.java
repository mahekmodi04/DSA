class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        getsum(0,nums,k,n,ans,new ArrayList<>());
        return ans;
    }
    private void getsum(int i, int nums[] , int size, int target ,List<List<Integer>> ans,List<Integer> ds){
        if(i == nums.length){
            if(size == 0 && target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(nums[i]);
        //pick up
        getsum(i+1,nums,size-1,target - nums[i], ans,ds);
        ds.remove(ds.size()-1);
        //not pickup
        getsum(i+1,nums,size,target, ans,ds);
    }
}