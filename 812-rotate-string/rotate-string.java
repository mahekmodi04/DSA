class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        String str = s + s;
        int i=0;
        int j=goal.length();
        while(j<str.length()){
            String substr = str.substring(i,j);
            if(goal.equals(substr)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}