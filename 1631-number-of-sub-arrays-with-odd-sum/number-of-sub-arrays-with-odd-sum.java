class Solution {
    public int numOfSubarrays(int[] arr) {
        long count = 0;
        long sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            count += sum %2;
            
        }
        count = count + (arr.length - count) * count;
       return (int)(count % 1_000_000_007);
      // return count;
    }
}