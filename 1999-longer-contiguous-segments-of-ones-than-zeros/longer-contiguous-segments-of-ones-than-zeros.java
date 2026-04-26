class Solution {
    public boolean checkZeroOnes(String s) {
        //same logic like consecutive ones - but here do it for both 1s and 0s
        int cnt1 = 0;
        int cnt0 = 0;
        int max1 = 0;
        int max0 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                cnt1++;
                max1 = Math.max(cnt1 , max1);
                cnt0 = 0;
            }
            else{
                cnt1 = 0;
                cnt0++;
                max0 = Math.max(cnt0 , max0);
            }

        }
        if(max1 > max0)return true;
        return false;
    }
}