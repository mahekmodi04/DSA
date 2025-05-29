class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int n = s.length();
        int i=0;
        int digit = 0;
        if(n==0){
            return 0;
        }
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            digit = s.charAt(i) - '0';
            if(result > (Integer.MAX_VALUE - digit)/10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                     return Integer.MIN_VALUE;
                } 
            }
            result = result*10 + digit;
            i++;
        }

        return result*sign;
    }
}