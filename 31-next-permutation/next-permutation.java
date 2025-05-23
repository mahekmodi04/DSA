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
         reverse(nums,0,n-1);
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
            reverse(nums, index + 1, n - 1);

        }
       
    //print
       for(int i=0;i<n;i++){
        System.out.print(nums[i]);
       }  
    }
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}