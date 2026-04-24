class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        res[n-1] = -1;//always samefor last element
        int max = arr[n-1]; // keep max as last element
        for(int i=n-2;i>=0;i--){ //largest to that ele exlcuding itself
            if(arr[i+1] >= max){//so i+1 
                max = arr[i+1];
            }
            res[i] = max;//store it in ith position

        }
        return res;
        
    }
}