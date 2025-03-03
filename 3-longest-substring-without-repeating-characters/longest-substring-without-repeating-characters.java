class Solution {
    public int lengthOfLongestSubstring(String s) {
        char alphabets[] = new char[128];
        int left = 0;
        int maxlength = 0;
        for(int i=0;i<s.length();i++){
            alphabets[s.charAt(i)]++;
            while(alphabets[s.charAt(i)] > 1){
                alphabets[s.charAt(left)]--;
                left++;
            }
            maxlength = Math.max(maxlength,i-left+1);
            
        }
        return maxlength;
    }
}


