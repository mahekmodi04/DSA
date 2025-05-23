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

        int m = grid.length;
        int n= grid[0].length;
        int bottom = 0;
        int left = n-1;
        int count = 0;
        while(bottom <m && left >=0){
            int ref = grid[bottom][left];
            if(ref < 0){
                if(left == 0){
                    count++;
                    bottom++;
                    left = n-1;
                }else{
                    count++;
                    left--;
                } 
            }
            else{
                bottom++;
                left = n-1;
            }
        }
        return count;
    }
}