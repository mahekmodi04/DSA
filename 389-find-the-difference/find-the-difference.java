class Solution {
    public char findTheDifference(String s, String t) {
        //using XOR 
        char xor = 0;
        for(int i=0;i<s.length();i++){
            xor ^= s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            xor ^= t.charAt(j);
        }
        return xor;
    }
}