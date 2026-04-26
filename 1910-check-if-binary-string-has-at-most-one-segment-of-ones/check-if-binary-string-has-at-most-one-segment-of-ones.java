class Solution {
    public boolean checkOnesSegment(String s) {
        int cnt = 0;
        int seg = 0;
        if(s.length() == 1){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                if(cnt == 0)seg++;
                cnt++;
            }
            
            else{
                cnt = 0;
            }
        
        }
        if(seg <= 1)return true;
        return false;
    }
}