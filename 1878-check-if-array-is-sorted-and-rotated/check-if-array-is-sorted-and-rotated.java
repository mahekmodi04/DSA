class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                int j =i+1;
                int cnt = 1;
                int n = nums.length;
                while(cnt < n){
                    if(nums[j%n] > nums[(j+1) % n])return false;
                    else{
                        j++;
                        cnt++;
                    }
                }
            }
        }
        return true;
    }
}