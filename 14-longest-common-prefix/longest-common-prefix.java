class Solution {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder str = new StringBuilder("");
       Arrays.sort(strs);
       int n = strs.length;
       String s1 = strs[0];
       String s2 = strs[n-1];
        int i=0;
       while(i < s1.length() && i < s2.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                str.append(s1.charAt(i));
                i++;
            }
            else{
                break;
            }  
       }
       return str.toString();
    }
}