class Solution {
    public void nextPermutation(int[] nums) {
        int bp = 0;
        int ref = 0;
        for(int i=nums.length-1 ; i>0;i--){
            if(nums[i] > nums[i-1]){
                bp = i;
                ref = i-1;
                break;
            }
        }
        if(bp == 0){
            int first = 0;
            int last = nums.length-1;
            while(first <= last){
            int t = nums[first];
            nums[first] = nums[last];
            nums[last] = t;
            first++;
            last--;
        }
        return;
        }
        for(int j=nums.length-1;j>=bp;j--){
            if(nums[j] > nums[ref]){
                int temp = nums[ref];
                nums[ref] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        //reverse 
        int first = bp;
        int last = nums.length-1;
        while(first <= last){
            int t = nums[first];
            nums[first] = nums[last];
            nums[last] = t;
            first++;
            last--;
        }
    }
}