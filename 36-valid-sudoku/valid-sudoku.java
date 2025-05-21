class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean validrow = false;
        boolean validcol = false;
        boolean validmat = false;

        //for row
        for(int i=0;i<9;i++){
            HashSet<Character> row = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] != '.' && (!row.add(board[i][j]))){
                    //validrow = false;
                    return false;
                }
            }
            validrow = true;
        }

        //for col
        for(int j=0;j<9;j++){
            HashSet<Character> col = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j] != '.' && (!col.add(board[i][j]))){
                    //validcol = false;
                    return false;
                }else{
                    col.add(board[i][j]);
                }
            }
            validcol = true;
        }

        //for mat
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                HashSet<Character> mat = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char curr = board[row+i][col+j];
                        if(curr != '.' && !mat.add(curr)){
                            return false;
                        }
                    }
                }
            }
            validmat = true;
        }
        if(validrow == true && validcol==true){
            if(validmat == true){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}