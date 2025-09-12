class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len = 0;
        int max = 0;
        HashMap<Character , Integer> map= new HashMap<>();
        int j =0;
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j , map.get(s.charAt(i))+1);
                map.put(s.charAt(i) , i);  
            }
            else{
                map.put(s.charAt(i) , i);
                
            }
            len = i - j+ 1;
            max = Math.max(max , len);
        }
        return max;
    }
}