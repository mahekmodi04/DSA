class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        int first =0;
        int last = n-1;
        k = k % n;
        while(first <= last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        first = 0;
        last = k-1;
        while(first <= last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        first = k;
        last = n-1;
        while(first <= last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}