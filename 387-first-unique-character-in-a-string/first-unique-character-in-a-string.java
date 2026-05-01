class Solution {
    public int firstUniqChar(String s) {
        
        //No hashSet approach bcozz it gives unique from a string even if there are many. 
        //We want the char having only single freq so use hashmap.

        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1)return i;
        }
        return -1;
    }
}