class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        int i =0;
        arr[0] = -1;
        arr[1] = -1;
        if(nums.length ==0){
           return arr;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] == target){
                arr[0] = i;
                break;
            }
        }
        if(arr[0] == -1){
            return arr;
        }
        int k = arr[0];
        for(i=k; i<nums.length;i++){
            if(nums[i] == target){
                arr[1] = i;
            }else{
                break;
            }
        }
        return arr;
    }

}