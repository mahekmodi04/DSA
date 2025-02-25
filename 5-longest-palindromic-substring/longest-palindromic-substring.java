class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0; 
        int maxlen = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isplaindrome(i,j,s) && (j-i+1) > maxlen){
                    start = i;
                    maxlen = j-i+1;
                    
                }
            }
        }
        return s.substring(start, start + maxlen);
    }
    public boolean isplaindrome(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}