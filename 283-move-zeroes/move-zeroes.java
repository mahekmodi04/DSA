class Solution {
    public void moveZeroes(int[] nums) {
        //brute force - to use temp take all non zeros and then push all zeros back 
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != 0){
        //         list.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<list.size();i++){
        //     nums[i] = list.get(i);
        // }
        // for(int i=list.size();i<nums.length;i++){
        //     nums[i] = 0;
        // }

        int j = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        int i = j+1;
        while(i<nums.length){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
    }
}