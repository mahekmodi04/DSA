class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder("");
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
                if(count > 1){
                    str.append(s.charAt(i));
                }
            }
            if(s.charAt(i) == ')'){
                count--;
                if(count > 0){
                    str.append(s.charAt(i));
                }
            }
            
        }
        return str.toString();
    }
}