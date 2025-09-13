class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        int n = strs.length;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
                i++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}