class Solution {
    public int countPrefixes(String[] words, String s) {
        //1 . use startswith to compare
        //2 . substring 
        int cnt = 0;
        for(int i=0;i<words.length;i++){
            if(words[i].length() <= s.length() && words[i].equals(s.substring(0, words[i].length()))){
                cnt++;
            }
        }
        return cnt;
    }
}