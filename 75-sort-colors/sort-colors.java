class Solution {
    public void sortColors(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1-i;j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
    

        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(nums[i] + ",");
        }


    }
}