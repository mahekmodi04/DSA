class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        //reversing the number
        int rev = 0;
        if(x < 0){
            return false;
        }
        while(x > 0){
            int t = x % 10;
            rev = rev * 10 + t;
            x = x/10;
        }
        if(copy == rev)return true;
        return false;
    }
}