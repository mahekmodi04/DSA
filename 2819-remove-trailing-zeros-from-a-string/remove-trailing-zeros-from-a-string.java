class Solution {
    public String removeTrailingZeros(String num) {
        int j = num.length()-1;
        for(int i=num.length()-1;i>=0 ;i--){
            if(num.charAt(i) != '0'){
                j=i;
                break;
            }

        }
        return num.substring(0,j+1);
    }
}