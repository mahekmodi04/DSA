class Solution {
    public int[] singleNumber(int[] nums) {
        long xor = 0;
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        long rightmost = (xor & (xor - 1)) ^ xor;
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if((rightmost & nums[i]) != 0){
                a ^= nums[i];
            }else{
                b ^= nums[i];
            }
        }
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}