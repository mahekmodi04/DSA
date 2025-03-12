class Solution {
    public int maximumCount(int[] nums) {
        int maxcount = 0;
        int pos = 0;
        int neg = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }
            // else{
            //     i++;
            // }
            i++;
        }
        if(neg > pos){
            return neg;
        }
        return pos;
    }
}