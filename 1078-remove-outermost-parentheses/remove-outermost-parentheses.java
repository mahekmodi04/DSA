class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
                if(cnt > 1){
                    sb.append(s.charAt(i));
                }
            }
            else{
                cnt--;
                if(cnt > 0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}