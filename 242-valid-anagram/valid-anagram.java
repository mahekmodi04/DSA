class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;

        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i=0;
        while(i<s.length()){
            if(ch1[i] != ch2[i])return false;
            i++;
        }
        return true;
    }
}