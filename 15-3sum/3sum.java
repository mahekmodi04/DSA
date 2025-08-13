class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> mlist = new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int j = i+1;
        int k = nums.length-1;
        while(j<k){
            int sum = nums[i] + nums[j] + nums[k];
            ArrayList<Integer> list = new ArrayList<>();
            if(sum == 0){
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                
                mlist.add(list);
                
                while(j < k && nums[j+1] == nums[j]){
                    j++;
                }
                j++;
                while(j < k && nums[k-1] == nums[k]){
                    k--;
                }
                k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
        }
       }
       return mlist;

    }
}