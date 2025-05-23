class Solution {
    public int singleNonDuplicate(int[] nums) {

         int n = nums.length;
         int low=0;
         int high= n-1;
         while(low<high){
            int mid = low+(high-low)/2;

            if((mid == n-1 || nums[mid] != nums[mid+1]) && (mid == 0 || nums[mid] != nums[mid-1])){
                return nums[mid];
            }
            else{
                if(mid %2 == 0){
                
                    if(nums[mid] == nums[mid+1]){//on right side
                        low = mid +1;
                    }
                    else{
                        high = mid-1;
                    }
                }
                else{
                    
                    if(nums[mid] == nums[mid+1]){//on left side
                        high = mid-1;
                    }
                    else{
                        low = mid +1;
                    }

                }
            }
            
            
         }
         return nums[low];
        // if(n==1){
        //     return nums[0];
        // }
        // int i=1;
        // int count = 1;
        // while(i<nums.length){
        //     if(nums[i] == nums[i-1]){
        //         count++;
        //         i++;
        //     }else{
        //         if(count > 1){
        //             i++;
        //             count = 1;
        //         }
        //         else{
        //             return nums[i-1];
        //         }
                
        //     }
        // }
        
        // int prev = -1;
        // int after = 1;
        // for(int i=0;i<nums.length;i++){
        //     if(prev >=0 && nums[i] == nums[prev]){
        //         prev = i;
        //     }
        //     else if(after < nums.length && nums[i] == nums[after]){
        //         after = i+1;
        //         i++;
        //     }
        //     else 
        //         return nums[i];
            
        // }
        // return nums[n-1];

    }
}