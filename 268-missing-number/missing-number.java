class Solution {
    public int missingNumber(int[] arr) {
        int k = 0;
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(k != arr[i])return k;
            k++;
        }
        return k;
    }
}