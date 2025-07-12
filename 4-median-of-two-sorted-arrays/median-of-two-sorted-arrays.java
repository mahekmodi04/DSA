class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int ans[] = new int[m+n];
        int i=0;
        int j=0;
        int k =0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                ans[k] = a[i];
                // while(i < a.length-1 && a[i] == a[i+1]){
                //     i++;
                // }
                i++;
                k++;
            }
            else{
                ans[k] = b[j];
                // while( j < b.length-1 && b[j] == b[j+1]){
                //     j++;
                // }
                j++;
                k++;
            }
            // else{
            //     ans[k] = a[i];
            //     // while(i < a.length-1 && a[i] == a[i+1]){
            //     //     i++;
            //     // }
            //     i++;
            //     // while(j < b.length-1 && b[j] == b[j+1]){
            //     //     j++;
            //     // }
            //     j++;
            //     k++;
            // }
        }
        while(i<a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            ans[k] = b[j];
            j++;
            k++;
        }

        if(ans.length % 2 == 0){
            int len = ans.length/2;
            return (ans[len] + ans[len-1])/ 2.0;
        }
        int len = ans.length;
        return ans[len/2];
    }
}