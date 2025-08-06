class Solution {
    public int strStr(String s1, String s2) {
        int j = s2.length();
       for(int i=0;i<s1.length()-j+1;i++){
        if(s1.charAt(i) == s2.charAt(0)){
            String sub = s1.substring(i,i+j);
            if(sub.equals(s2))return i;
        }
       }
       return -1;
    }
}