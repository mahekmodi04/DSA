class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String str = "";
        String longest  = s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=n-1;j>=i;j--){
                
            if(s.charAt(i) == s.charAt(j)){
                str = s.substring(i,j+1);
                if(ispalindrome(str)){
                    if(str.length() > longest.length()){
                        longest = str;
                    }
                }
            }
                 
            }
        }
        
        return longest;
    }
    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}