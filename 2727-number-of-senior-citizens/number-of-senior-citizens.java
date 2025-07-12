class Solution {
    public int countSeniors(String[] details) {
        int n = 0;
        for(int i=0;i<details.length;i++){
            String s = details[i];
            if(s.charAt(11) == '6' && s.charAt(12) == '0'){
                continue;
            }
            if(s.charAt(11) >= '6' && s.charAt(12) >= '0'){
                n++;
            }
        }
        return n;
    }
}