class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        while(i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(i+needle.length() <= haystack.length()){
                    String substr = haystack.substring(i,i+needle.length());
                    if(substr.equals(needle)){
                        return i;
                    }
                }
                else{
                    return -1;
                }
                
            }
            i++;
        }
        return -1;
    }
}