class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int i =0;
        int j =n-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid] == target){
                return true;
            }
            if (nums[i] == nums[mid] && nums[j] == nums[mid]){//for handling duplicates..otherwise it is same like ist part of this que
                i++;
                j--;
                continue;
            }
            if(nums[mid] >= nums[i]){
                if(target <= nums[mid] && target >= nums[i]){
                    j = mid - 1;
                }
                else{
                    i = mid + 1;
                }  
            }
            else{
                if(target >= nums[mid] && target <= nums[j]){
                    i = mid + 1;
                }
                else{
                    j = mid - 1;
                }  
            }
        }
        return false;
    }
}