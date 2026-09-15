class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int firstrow = 0;
        int firstcol = 0;
        int lastrow = m-1;
        int lastcol = n-1;

        while(firstcol <= lastcol && firstrow <= lastrow){

            
            
                //top
                int i = firstrow;
                for(int j=firstcol; j<=lastcol ; j++){
                    ans.add(matrix[i][j]);
                }
                //right
                int j = lastcol;
                for(i=firstrow + 1; i<=lastrow; i++){
                    ans.add(matrix[i][j]);
                }

            
            
            if(firstrow < lastrow){
                //bottom
                i = lastrow;
                for(j = lastcol-1 ; j>=firstcol; j--){
                    ans.add(matrix[i][j]);
                }
            }
            if(firstcol < lastcol){
                //left
                j = firstcol;
                for(i = lastrow - 1; i>firstrow ; i--){
                    ans.add(matrix[i][j]);
                }
            }
            
            firstcol++;
            firstrow++;
            lastcol--;
            lastrow--;
        }
        return ans;
    }
}