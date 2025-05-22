class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m= matrix[0].length;
        int firstrow = 0;
        int lastrow = n-1;
        int firstcol = 0;
        int lastcol = m-1;
        while(firstrow <= lastrow && firstcol <= lastcol){

            //top
            int i=firstrow;
            for(int j=firstcol;j<=lastcol;j++){
                list.add(matrix[i][j]);
            }
            //right
            int j=lastcol;
            for(i=firstrow+1;i<=lastrow;i++){
                list.add(matrix[i][j]);
            }
            //bottom
            i = lastrow;
            if(firstrow < lastrow){
                for(j=lastcol-1;j>=firstcol;j--){
                    list.add(matrix[i][j]);
                }

            }
            
            //left
            j=firstcol;
            if(firstcol < lastcol){
                for(i=lastrow-1;i>firstrow;i--){
                    list.add(matrix[i][j]);
                }
            }
            
            firstrow++;
            lastrow--;
            firstcol++;
            lastcol--;
        }
        return list;
    }
}