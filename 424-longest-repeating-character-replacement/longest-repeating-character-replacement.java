class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int hash[] = new int[26];
        Arrays.fill(hash,0);
        int l=0;
        int r=0;
        int maxf = 0;
        int maxlen = 0;

        while(r< n){
            hash[s.charAt(r) -'A']++;
            //update the maxf
            maxf = Math.max(maxf ,hash[s.charAt(r) -'A']);
            //find maxlen
            // maxlen = Math.max(maxlen,r-l+1);
            //check if seq valid
            if((r-l+1) - maxf > k){
                hash[s.charAt(l) - 'A']--;
                l++;
                
            }
            maxlen = Math.max(maxlen , r-l+1);
            r++;
        }
        return maxlen;
    }
}