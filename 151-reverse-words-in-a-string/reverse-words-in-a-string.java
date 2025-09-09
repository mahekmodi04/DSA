class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        int i = s.length()-1;
        while(s.charAt(i) == ' '){
            i--;
        }
        int j = i;
        while(i>=0){
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            sb.append(s.substring(j+1,i+1));
            sb.append(" ");
            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }
            i=j;
        }
        return sb.toString().trim();
    }
}