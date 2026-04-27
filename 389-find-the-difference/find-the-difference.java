class Solution {
    public char findTheDifference(String s, String t) {
        //using XOR 
        char xor = 0;
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        for(int i=0;i<c1.length;i++){
            xor ^= c1[i];
        }
        for(int j=0;j<c2.length;j++){
            xor ^= c2[j];
        }
        return xor;
    }
}