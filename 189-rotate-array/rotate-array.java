class Solution {
    public void rotate(int[] nums, int k){
        int i=0;
        int n = nums.length;
        int j=n-1;
        k = k%n;
        while(i<j){
            //reverse
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        i = 0;
        j=k-1;
        while(i<j){
            //first half reverse
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        i=k;
        j=n-1;
        while(i<j){
            //reverse
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        
    }
    
}