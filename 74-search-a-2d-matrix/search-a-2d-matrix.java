class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int n = matrix.length;
        // int m = matrix[0].length;
        // int left = m-1;
        // int bottom = 0;
        // while(left >=0 && bottom < n){
        //         int ref = matrix[bottom][left];
        //         if(target == ref){
        //             return true;
        //         }
        //         if(target > ref){
        //             bottom++;
        //         }
        //         else{
        //             left--;
        //         }   
        // }
        // return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int bottom = 0;
        int left = n-1;
        while(bottom < m && left >=0){
            int ref = matrix[bottom][left];

            if(target == ref){
                return true;
            }
            else if(target < ref){
                left--;
            }
            else{
                bottom++;
            }
        }
        return false;
    }
}