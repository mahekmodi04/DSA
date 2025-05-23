class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // int prefix[] = new int[n];
        // //prefix sum array 
        // prefix[0] = nums[0];
        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        //for each prefix sum we want a subarray with k so sum - k is what we search for
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
            if(map.containsKey(sum - k)){
                count = count + map.get(sum-k);
            }
            map.put(sum ,map.getOrDefault(sum ,0)+1);
            
        }

        return count;

    }
}
