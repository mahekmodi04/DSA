class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        int i=0;
        while(i< s.length()){
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i) , t.charAt(i));
                    i++;
                }
                else{
                    return false;
                }
            }
            else{
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
                i++;

            }
            

        }
        return true;
    }
}