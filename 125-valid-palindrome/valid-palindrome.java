class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list = new ArrayList<>();
        s = s.toLowerCase();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                list.add(ch);
            }
        }
        int i=0;
        int j = list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){//in string check for .equals for checking equal characters instead of list.get(i) != list.get(j) -> this will check for objects different references in memory
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}