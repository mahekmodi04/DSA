class Solution {
    public int search(int[] nums, int target) {
      //using binary search - modified
      int n = nums.length;
      int low = 0;
      int high = n-1; 
      while(low<=high){

        int mid = low  +  (high - low)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[low] <= nums[mid]){
            //left arr is sorted
            if(target >= nums[low] && target < nums[mid]){
                high = mid - 1;
            }
            else{//agar ye sahi nhi hai if condition then go to right array
                low = mid + 1;
            }
        }
        else {
            //right arr is sorted
            if(target <= nums[high] && target > nums[mid]){
                low = mid + 1;
            }
            else{//agar right array condition false hai toh go to left array 
                high = mid - 1;
            }
        }
        
      } 
      return -1;
    }
}