class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int pos = 0;
        int neg = 1;
        // for(int i=0;i<n;i+=2){
        //     for(int j=1;j<n;j+=2){
        //         if(nums[i] < 0 && nums[j] > 0){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }
            else{
                arr[neg] = nums[i];
                neg +=2;
            }
        }
        return arr;
    }
}