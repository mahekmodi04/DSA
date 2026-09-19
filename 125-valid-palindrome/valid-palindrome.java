class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())return true;
        String s1 = s.toLowerCase();

        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(Character.isLetterOrDigit(c)){
                list.add(c);
            }
        }
       
        int i =0;
        int j=list.size()-1;
        while(i<=j){
            
            if(list.get(i) != list.get(j))return false;
            i++;
            j--; 

        }
        return true;
    }
}