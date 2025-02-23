class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = m-1;
        int bottom = 0;
        while(left >=0 && bottom < n){
                int ref = matrix[bottom][left];
                if(target == ref){
                    return true;
                }
                if(target > ref){
                    bottom++;
                }
                else{
                    left--;
                }   
        }
        return false;
    }
}