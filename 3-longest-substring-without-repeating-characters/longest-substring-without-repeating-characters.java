class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j=0;
        int i=0;
        HashMap<Character , Integer> hash = new HashMap<>();
        int maxlen = 0;

        while(j<s.length()){
            if(hash.containsKey(s.charAt(j))){
                i = Math.max(i , hash.get(s.charAt(j)) + 1) ;
                hash.put(s.charAt(j) , j);
                j++;
            }
            else{
                hash.put(s.charAt(j) , j);
                j++;
            }
            int len = j-i;
            maxlen = Math.max(len , maxlen);
        }
        return maxlen;
    }
}