class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int i =0;
        int j= 0;
        if(s.length == 0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(g[i] <= s[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }

        }
        return count;
    }
}