class Solution {
    public char findTheDifference(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int i=0;
        int j=0;
        while(i<c1.length && j<c2.length){
            if(c1[i] != c2[j]){
                return c2[j];
            }
            else{
                i++;
                j++;
            }
        }
        return c2[c2.length-1];
    }
}