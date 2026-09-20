class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        //helper function
        return check(list, 0 , list.size()-1);
    }
    public boolean check(List<Character> list , int i, int j){
        if(i>=j)return true;
        if(list.get(i) != list.get(j))return false;
        return check(list, i+1,j-1);
    }
}
