class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n==1)return true;
        int cnt = 1;

        for(int i=1;i<2*n;i++){
            if(nums[i%n] >= nums[(i-1)%n]){
                cnt++;
                if(cnt == n)return true;
                
            }
            else{
                cnt = 1;
            }
            
           
        }
        return false;

    }
}