class Solution {
    public int minimumRecolors(String blocks, int k) {
        // int n= blocks.length();
        
        // int mincount= Integer.MAX_VALUE;
        // for(int i=0;i<=n-k;i++){
        //     int count = 0;
        //     for(int j=i;j<i+k;j++){
        //         if(blocks.charAt(j) == 'W'){
        //             count++;
        //         }
        //     }
        //     mincount = Math.min(mincount ,count);
        // }
        // return mincount;

        
    int n = blocks.length();
    int count = 0, mincount;

    // Count 'W' in the first window of size 'k'
    for (int i = 0; i < k; i++) {
        if (blocks.charAt(i) == 'W') {
            count++;
        }
    }

    mincount = count; // Set initial minimum count

    // Slide the window across the string
    for (int i = k; i < n; i++) {
        if (blocks.charAt(i - k) == 'W') count--; // Remove leftmost element
        if (blocks.charAt(i) == 'W') count++; // Add new element
        
        mincount = Math.min(mincount, count);
    }

    return mincount;


    }
}