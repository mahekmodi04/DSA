class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int cnt = 1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                cnt++; 
            }
            else{
                if(cnt > n/3 && !list.contains(nums[i-1])){
                    list.add(nums[i-1]);
                }
                cnt = 1;
            }
        }
        if(cnt > n/3 && !list.contains(nums[n-1])){
            list.add(nums[n-1]);
        }
        return list;
    }
}