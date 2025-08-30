class Solution {
    public void setZeroes(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    makerow(i,mat);
                    makecol(j,mat);
                }
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 'c'){
                    mat[i][j] = 0;
                }
            }
        }
        
    }
    public static void makerow(int i, int mat[][]){
            
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j] != 0){
                mat[i][j] = 'c';
            }  
        }
    }
    public static void makecol(int j, int mat[][]){
            
        for(int i=0;i<mat.length;i++){
            if(mat[i][j] != 0){
                mat[i][j] = 'c';
            }  
        }
    }
}