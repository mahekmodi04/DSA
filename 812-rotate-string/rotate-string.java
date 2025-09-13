class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        int n = goal.length();
        String str = s + s;
        for(int i=0;i<=str.length()-n;i++){
            if(str.charAt(i) == goal.charAt(0)){
                String sub = str.substring(i,i+n);
                if(sub.equals(goal))return true;
            }
        }
        return false;
    }
}