class Solution {
    public String largestOddNumber(String num) {
        
        int n = num.length();
        int i=n-1;
        while(i>=0){
            if(num.charAt(i) % 2 == 0){
                i--;
            }
            else{
                return num.substring(0 , i+1);
            }
        }
        return "";
    }
}