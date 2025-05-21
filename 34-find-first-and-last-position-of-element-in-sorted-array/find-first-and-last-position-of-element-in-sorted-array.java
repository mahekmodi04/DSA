class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];
        boolean isfound = false;

        for(int i=0;i<n;i++){
            if(nums[i] == target){
                arr[0] = i;
                isfound = true;
                i++;
                while( i < n && nums[i] ==target){
                    i++;
                }
                arr[1] = i-1;
            }

        }
        if(!isfound){
            arr[0] = -1;
            arr[1] = -1;
        }
        return arr;
    }

}