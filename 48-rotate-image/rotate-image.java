class Solution {
    public void rotate(int[][] nums) {
        // int n = matrix.length;
        // //transpose
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
            
        // }
        // //swap the rows
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n/2;j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][n-j-1];
        //         matrix[i][n-j-1] = temp;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
            
        //         System.out.print(matrix[i][j]);
        //     }
            
        // }

        int n = nums.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        //rotate 
        int i=0;
        int j=n-1;
        while(i<=j){
            for(int k=0;k<n;k++){
                int temp = nums[k][i];
                nums[k][i] = nums[k][j];
                nums[k][j] = temp;
            }
            i++;
            j--;
        }

        //print
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(nums[i][j]);
            }
        }

        
    }
}