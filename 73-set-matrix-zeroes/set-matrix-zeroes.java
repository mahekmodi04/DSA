class Solution {
    public void setZeroes(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    makerow(i,matrix);
                    makecol(j,matrix);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 'c'){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    public static void makerow(int i , int[][] matrix){
        for(int c=0;c<matrix[0].length;c++){
            if(matrix[i][c] != 0)matrix[i][c] = 'c';
        }
    }
    public static void makecol(int j , int[][] matrix){
        for(int r=0;r<matrix.length;r++){
            if(matrix[r][j] != 0)matrix[r][j] = 'c';
        }
    }
}