class Solution {
    public void nextPermutation(int[] nums) {
        int bp = -1;
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                bp = i-1;
                break;
            }
        }
        if(bp == -1){
            int first = 0;
            int last = n-1;
            while(first <= last){
                int t = nums[first];
                nums[first] = nums[last];
                nums[last] = t;
                first++;
                last--;
            }
            return;
        }
        //int smallest = 0;
        for(int i=n-1;i>bp;i--){
            if(nums[i] > nums[bp]){
                int t = nums[bp];
                nums[bp] = nums[i];
                nums[i] = t;
                 break;
            }
           
        }
        int left = bp + 1, right = n - 1;
        while(left < right) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
            left++;
            right--;
        }
    }
}