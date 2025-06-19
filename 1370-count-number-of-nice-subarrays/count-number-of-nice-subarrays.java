class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odds = 0;
        int count = 0;
        int l=0;
        int r=0;
        int n = nums.length;
        int even = 0;
        while(r < nums.length){
            if(nums[r] %2 != 0){
                odds++;
            }
            while(odds > k){
                if(nums[l] % 2 != 0){
                    odds--;
                }
                l++;
            }
            if(odds == k){
                even = 0;
                int temp = l;
                while(temp < r && nums[temp] %2 == 0){
                    temp++;
                    even++;
                }
                count += even + 1;
            }
            r++;
            
        }
        return count;
    }
}