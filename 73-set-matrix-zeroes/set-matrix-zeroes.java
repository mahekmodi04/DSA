class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    makerow(i,matrix);
                    makecol(j,matrix);
                }
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 'c'){
                    matrix[i][j] = 0;
                }
            }
        } 
    }

    public void makerow(int i,int matrix[][]){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = 'c';
            }
        }
    }

    public void makecol(int j,int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = 'c';
            }
        }
    }
}