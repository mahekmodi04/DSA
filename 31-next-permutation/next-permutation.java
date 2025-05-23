import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
       int n = nums.length;
       for(int i=n-1;i>0;i--){
        if(nums[i] > nums[i-1]){
            index = i-1;
            break;
        }
       }
       if(index == -1){//edge case for last element
         Arrays.sort(nums);
       }
       else{
            for(int i=n-1;i>=index;i--){// find smallest greater element nums[i+1] and swap it
            if(nums[i] > nums[index]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // sort the remaining part
            for(int i=index+1;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i] > nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }

    }
       
    //print
       for(int i=0;i<n;i++){
        System.out.print(nums[i]);
       }

        
    }
}