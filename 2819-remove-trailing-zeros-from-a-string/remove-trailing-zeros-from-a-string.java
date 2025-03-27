class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int i = n-1;
        int index = 0;
        while(i>=0){
            if(num.charAt(i)=='0'){
                i--;
            }
            else{
               // index = i;
                break;
            }
        }
        return num.substring(0,i+1);
    }
}