class Solution {
    public String longestPalindrome(String s) {
        int longest = 1;
        String ans = s.substring(0,1);
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(s.charAt(i) == s.charAt(j)){
                    String sub = s.substring(i,j+1);
                    if(ispalindrome(sub)){
                        if(longest < sub.length()){
                            longest = sub.length();
                            ans = sub;
                        }
                        
                    }
                }
            }
        }
        return ans;
    }
    public static boolean ispalindrome(String str){
        int i =0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}