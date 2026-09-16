class Solution {
    public int reverse(int x) {
        int reversed = 0;
        
            while(x != 0){
                int t = x % 10;
                if(reversed > Integer.MAX_VALUE/ 10|| (reversed == Integer.MAX_VALUE/10 && t > 7)){
                    return 0;
                }
                if(reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && t <-8)){
                    return 0;
                }
                reversed = reversed * 10 + t;
                x = x / 10;
            }
        
        
        return reversed;
    }
}