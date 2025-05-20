import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() == 1){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int count = 1;
            while(nums[i] == nums[i-1]){
                count++;
                i++;
            }
            if(count==1){
                return nums[i-1];  
            }
        }
        return nums[nums.length-1];
    }
}