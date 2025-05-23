class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        
        // int i=0;
        // int j=0;
        // while(i<a.length && j<n){
        //     if(a[i] < b[j] && a[i] !=0){
        //         i++;
        //     }
        //     else if(a[i] < b[j] && a[i] == 0){
        //         a[i] = b[j];
        //     }
        //     else if(a[i] == b[j]){
        //         i++;
        //         int temp = a[i];
        //         a[i] = b[j];
        //     }
        //     else{
                
        //         j++;
            
            
        // }
        // Arrays.sort(a);
        // for(i=0;i<a.length;i++){
        //     System.out.print(a[i]);
        // }

        if (a.length - m != n) {
            System.out.print("-1");
            return; // Stop execution
        }

        int i = m; // Start from the last index of array a
        int j = 0;            // Start from beginning of array b

        while (j < n) {
            a[i] = b[j];
            j++;
            i++;
        }

        Arrays.sort(a);

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

            
    }
}