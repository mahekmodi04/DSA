class Solution {
    public int lengthOfLongestSubstring(String s) {
        int map[] = new int[256];
        Arrays.fill(map , -1);

        int l= 0;
        int r= 0;
        int maxlen = 0;
        int n = s.length();
        int len = 0;
        while(r < n){
            if(map[s.charAt(r)] != -1){
                if(map[s.charAt(r)] < l){
                    map[s.charAt(r)] = r;
                    len = r-l+1;
                    
                }
                else{
                    l = map[s.charAt(r)] + 1;
                    len = r-l+1;
                    map[s.charAt(r)] = r;
                }
                maxlen = Math.max(maxlen,len);
                r++;
            }
            else{
                map[s.charAt(r)] = r;
                len = r-l+1;
                maxlen = Math.max(maxlen,len);
                r++;
            }
        }
        return maxlen;
    }
}