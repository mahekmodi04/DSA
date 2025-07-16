class Solution {
    public int findKthPositive(int[] arr, int k) {
        int last = arr[arr.length-1];
        int t = 0;
        for(int i=1;i<=last;i++){
            if(t < arr.length && arr[t] == i){
                t++;
            }
            else{
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return last + k;
    }
}