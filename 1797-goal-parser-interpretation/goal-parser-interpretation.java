class Solution {
    public String interpret(String command) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<command.length();i++){
        //     if(command.charAt(i)=='G'){
        //         sb.append('G');
        //     }
        //     else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                
        //         sb.append('o');
        //         i++;
        //     }
        //     else{
        //         sb.append('a');//cannot accept al together in append so do it alag
        //         sb.append('l');
        //         i+=3;
        //     }
        // }
        // return sb.toString();

        return command.replace("()", "o").replace("(al)", "al");
    }
}