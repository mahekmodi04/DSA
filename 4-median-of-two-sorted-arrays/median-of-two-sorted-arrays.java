class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int arr[] = new int[a.length + b.length];
        int k =0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                arr[k] = a[i];
                k++;
                i++;
            }
            else{
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k] = b[j];
            j++;
            k++;
        }
        
        if(arr.length % 2 == 0){
            int n = arr.length / 2;
            return (arr[n] + arr[n-1])/2.0;
        }
        int n = arr.length / 2;
        return arr[n];
    }
}