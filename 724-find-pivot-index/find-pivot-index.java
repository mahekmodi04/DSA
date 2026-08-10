class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        //array sum 
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
        }
        int leftmost = 0;
        int rightmost = total;

        for(int i=0;i<nums.length;i++){
            if(leftmost == rightmost-nums[i]){
                return i;
            }
            rightmost = total - leftmost - nums[i];
            leftmost += nums[i];
            
        }
        return index;
    }
}