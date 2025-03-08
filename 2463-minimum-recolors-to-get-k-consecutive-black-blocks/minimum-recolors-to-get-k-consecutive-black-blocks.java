class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n= blocks.length();
        
        int mincount= Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int count = 0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j) == 'W'){
                    count++;
                }
            }
            mincount = Math.min(mincount ,count);
        }
        return mincount;
    }
}