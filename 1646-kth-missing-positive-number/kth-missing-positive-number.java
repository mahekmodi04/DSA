class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        int ele = arr[n-1] + k;
        int j = 1;
        int i =0;
        while(i<n && j<=arr[n-1]){
            if(arr[i] == j){
                i++;
                j++;
            }
            else{
                count++;
                if(count == k){
                    return j;
                }
                j++;
            }
            
        }
        return j + (k - count - 1);
    }
}