class Solution {
    public String reverseWords(String s) {
        // StringBuilder sb= new StringBuilder("");
         int n = s.length();
        // int i = n-1;
        // while(i>=0){
        //     while(i>=0 && s.charAt(i)==' '){
        //     i--;
        //     }
        //     int j = i;
        //     while(i>=0 && s.charAt(i) != ' '){
        //         i--;
        //     }
        //     if(sb.length() > 0){
        //         sb.append(" ");
        //     }
        //     sb.append(s.substring(i+1,j+1));
        // }
        // return sb.toString();

        StringBuilder str = new StringBuilder("");
        int i = n-1; 
        while(i >= 0 && s.charAt(i)== ' '){
            i--;
        }
        
        while(i >=0){
            int k = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            str.append(s.substring(i+1 , k+1));
            str.append(" ");
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            
        }
        
        return str.toString().trim();
        }
        
}
