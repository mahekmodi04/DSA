class Solution {
    public String largestOddNumber(String num) {
        int j=num.length()-1;
        for(int i=num.length()-1 ; i>=0;i--){
            if(num.charAt(i) % 2 != 0){
                j = i;
                break;
            }
            else{
                j--;
            }
        }
        return num.substring(0,j+1);
    }
}