class Solution {
    public int countSeniors(String[] details) {
        int n = 0;
        for(int i=0;i<details.length;i++){
            String s = details[i];
            if(s.charAt(s.length() - 4) == '6' && s.charAt(s.length() - 3) == '0'){
                continue;
            }
            if(s.charAt(s.length() - 4) >= '6' && s.charAt(s.length() - 3) >= '0'){
                n++;
            }
        }
        return n;
    }
}