class Solution {
    public int findDuplicate(int[] nums) {
//method1
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!set.add(nums[i])){
        //         return nums[i];
        //     }
        // }
        // return -1;
//method2
        // int n = nums.length;
        // int count[] = new int[n];
        // for(int i=0;i<n;i++){
        //     count[nums[i]]++;
        //     if(count[nums[i]] > 1){
        //         return nums[i];
        //     }
        // }
        // return -1;
    
//method3
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}