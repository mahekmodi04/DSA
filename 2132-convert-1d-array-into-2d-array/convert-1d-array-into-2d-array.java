class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][0];
        }
        
        int ans[][] = new int[m][n];
        int rows = m;
        int col = n;
        int t = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(t<original.length){
                ans[i][j] = original[t];
                t++;
                }
            }
            //t++;
        }
        return ans;
    }
}