class Solution {
    public void moveZeroes(int[] arr) {
        // int nonzero = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != 0){
        //         int temp = nums[i];
        //         nums[i] = nums[nonzero];
        //         nums[nonzero] = temp;
        //         nonzero++;
        //     }
        // }

        // int zero = 0;
        // //int temp =0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == 0){
        //         zero = i;
        //         int j = i+1;
        //         if(arr[j] !=0){
        //             int temp = arr[j];
        //             arr[j] = arr[zero];
        //             arr[zero] = temp;
        //             j++;
                   
        //         }
                
        //     }
        // }
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(j<n){
            if( arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;       
            
        }
    }
}
