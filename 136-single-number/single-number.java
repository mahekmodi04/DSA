import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int count = 1;
            while(nums[i] == nums[i+1]){
                count++;
                i++;
            }
            if(count==1){
                return nums[i];
            }

        }
        return nums[n-1];
    }
}