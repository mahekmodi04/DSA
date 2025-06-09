class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = new int[2];
        long XOR = 0;
        for(int i=0;i<nums.length;i++){
            XOR ^= nums[i];
        }
        long rightmost = (XOR & (-XOR));
        int b1 = 0;
        int b2 = 0;
        for(int j=0;j<nums.length;j++){
            if((rightmost & nums[j]) != 0){
                b1 ^= nums[j];
            }
            else{
                b2 ^= nums[j];
            }  
        }
        arr[0] = b1;
        arr[1] = b2;
        return arr;
    }
}