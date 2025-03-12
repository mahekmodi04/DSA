class Solution {
    public int countNegatives(int[][] grid) {
        // int count = 0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j] < 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int left = m-1;
        int bottom = 0;
        while(bottom < n && left >=0 ){
            int ref = grid[bottom][left];
            if(grid[bottom][left] < 0){
                count += (n - bottom);
                left--;
            }
            else{
                bottom++;
                
            }
        }
        return count;
    }
}