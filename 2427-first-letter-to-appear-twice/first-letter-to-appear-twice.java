class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char c = 0;
        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i))){
                c = s.charAt(i);
                break;
            }else{
                set.add(s.charAt(i));
            }
            
        }
        return c;
    }
}