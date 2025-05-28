class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) ,0)+1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder str = new StringBuilder("");
        for(Map.Entry<Character, Integer> entry : entryList){
            char ch = entry.getKey();
            for(int i=0;i<entry.getValue();i++){
                str.append(ch);
            }
        }
        return str.toString();
    }
}