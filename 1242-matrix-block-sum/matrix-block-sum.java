class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        int ans[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum = 0;
                for(int t1 = Math.max(0,i-k); t1 <= Math.min(n-1 , i+k) ; t1++){
                    for(int t2 = Math.max(0,j-k) ; t2 <= Math.min(m-1 ,j+k) ; t2++){
                        sum += mat[t1][t2];
                    }
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}