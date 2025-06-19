class Solution {
    public int numberOfSubstrings(String s) {
        if(s.length() < 3){
            return 0;
        }
        int cnta = 0;
        int cntb = 0;
        int cntc = 0;
        int r = 0;
        int l=0;
        int count = 0;

        while(r< s.length()){
            char ch = s.charAt(r);
            if(ch == 'a'){
                cnta++;
            }
            else if(ch =='b'){
                cntb++;
            }
            else{
                cntc++;
            }
            
            while(cnta >= 1 && cntb >= 1 && cntc >=1){
                count += s.length()-r;

                char temp = s.charAt(l);
                if(temp == 'a')cnta--;
                else if(temp == 'b')cntb--;
                else{
                    cntc--;
                }
                l++;
            }
            r++;
                
        }
        return count;
    }
}