class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isrow = false;
        boolean iscol = false;
        boolean ismat = false;

        // for row
        for(int i=0;i < board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j < board[0].length;j++){
                if(board[i][j] != '.' && ! set.add(board[i][j])){
                    return false;
                }
                // else{
                //     set.add(board[i][j]);
                // }
            }
        }
        isrow = true;

        //for col
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[j][i] != '.' && !set.add(board[j][i])){
                    return false;
                }
                // else{
                //     set.add(board[j][i]);
                // }
            }
        }
        iscol = true;

        //for mat 
        for(int i=0;i<board.length;i+= 3){
            for(int j=0;j<board[0].length;j +=3){
                HashSet<Character> set = new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int t=j;t<j+3;t++){
                        if(board[k][t] != '.' && !set.add(board[k][t]))return false;
                        // else{
                        //     set.add(board[k][t]);
                        // }
                    }
                }
            }
        }
        ismat = true;

        if(isrow == true && iscol ==true){
            if(ismat == true){
                return true;
            }
            return false;
        }
        return false;
    }
}