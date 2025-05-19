class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int sum = nums[i]+nums[j];
        //         int target = 0 - sum;
        //         int k = j+1;
        //         while(k < n){
        //             if(nums[k] == target){
        //                 List<Integer> list = new ArrayList<>();
        //                 list.add(nums[i]);
        //                 list.add(nums[j]);
        //                 list.add(nums[k]);
        //                 Collections.sort(list);
        //                 mainlist.add(list);
        //                 break;
        //             }
        //             else{
        //                 k++;
        //             }
        //         }
        //     }
        // }
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> mainlist = new HashSet<>();
        int i=0;
        while(i<n-1){
            int j=i+1;
            int k =n-1;
            while(k>j){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        mainlist.add(list);
                        j++;
                        k--;
                }
                else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                else{
                    k--;
                }

            }
            i++;
        }
         return new ArrayList<>(mainlist);
    }
}