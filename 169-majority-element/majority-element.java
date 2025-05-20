class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}