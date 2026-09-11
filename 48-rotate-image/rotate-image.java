class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //col swap
        int i=0;
        int j=m-1;
        while(i<j){
            for(int k=0;k<n;k++){
                int t = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = t;
            }
            i++;
            j--;
        }

    }
}