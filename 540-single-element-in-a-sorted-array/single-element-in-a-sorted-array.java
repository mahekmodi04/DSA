class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int i=1;
        int count = 1;
        while(i<nums.length){
            if(nums[i] == nums[i-1]){
                count++;
                i++;
            }else{
                if(count > 1){
                    i++;
                    count = 1;
                }
                else{
                    return nums[i-1];
                }
                
            }
        }
        
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
         return nums[n-1];

    }
}