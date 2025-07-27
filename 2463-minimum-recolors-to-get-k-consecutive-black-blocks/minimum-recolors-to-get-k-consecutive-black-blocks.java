class Solution {
    public int minimumRecolors(String blocks, int k) {
        int swaps = 0;
        int w = 0;
        int min = 0;
        //count white in first window
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                w++;
            }
        }
        swaps = w;
        min = swaps;
        for(int i=0,j=k;j<blocks.length();i++,j++){
            if(blocks.charAt(i) == 'W'){
                swaps--;
            }
            if(blocks.charAt(j) == 'W'){
                swaps++;
            }
            if(min > swaps) min = swaps;
        }
        return min;
    }
}