class Solution {
    public int numOfSubarrays(int[] arr) {
       long mod = 1_000_000_007;
       long cnt = 0;
       long sum = 0;
       for(int i=0;i<arr.length;i++){
        sum += arr[i];
        cnt += sum % 2;
       }
       cnt = cnt + (arr.length - cnt)* cnt;
       return (int)(cnt % mod);
    }
}