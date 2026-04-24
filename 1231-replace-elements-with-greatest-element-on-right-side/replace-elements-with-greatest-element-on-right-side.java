class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        res[n-1] = -1;
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i+1] >= max){
                max = arr[i+1];
            }
            res[i] = max;

        }
        return res;
        
    }
}