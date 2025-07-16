class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1])continue;

            int left = i+1;
            int right = n-1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    ArrayList<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[left]);
                    l1.add(nums[right]);
                    
                    list.add(l1);
                    
                    while(left < right && nums[left] == nums[left + 1])left++;
                    while(left < right && nums[right] == nums[right - 1])right--;
                    left++;
                    right--;
                }
                else if(nums[i]+ nums[left]+ nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
            
        }
        return list;
    }
}