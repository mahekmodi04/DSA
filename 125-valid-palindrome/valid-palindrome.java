class Solution {
    public boolean isPalindrome(String s) {
        ///recursion
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return check(s,0,s.length()-1);
    }
    public boolean check(String s, int i,int j){
        if(i>=j)return true;
        if(s.charAt(i) != s.charAt(j))return false;
        return check(s,i+1,j-1);
    }
}
