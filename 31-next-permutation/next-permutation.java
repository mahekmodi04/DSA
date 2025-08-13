class Solution {
    public void nextPermutation(int[] nums) {
        //1.find the breaking pt
        int bp = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                bp = i;
                break;
            }
        }
        
        if(bp == -1){
            int i=0;
            int j = nums.length-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        int tar = bp-1;
        for(int i=nums.length-1;i>=bp ;i--){
            if(nums[i] > nums[tar]){
                int temp = nums[i];
                nums[i] = nums[tar];
                nums[tar] = temp;
                break;
            }
        }
        int i=bp;
        int j = nums.length-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}