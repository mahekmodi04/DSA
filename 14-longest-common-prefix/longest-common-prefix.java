class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder("");
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int i=0;
        int j = 0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                str.append(s1.charAt(i));
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return str.toString();
    }
}