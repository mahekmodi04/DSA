class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int len = 0;
        int max = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j) , j);
            }
            else{
                int pos = map.get(s.charAt(j));
                if(pos >= i){
                    i = pos+1;
                }
                map.put(s.charAt(j) , j);
            }
            len = j-i+1;
            j++;
            if(max < len)max = len;
        }
        return max;
    }
}