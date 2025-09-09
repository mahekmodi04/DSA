class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = matrix[0].length-1;
        int bot = 0;
        
        while(left >= 0 && bot < matrix.length){
            int ref = matrix[bot][left];
            if(target == ref){
                return true;
            }
            else if(target < ref){
                left--;
            }
            else{
                bot++;
            }
        }
        return false;
    }
}