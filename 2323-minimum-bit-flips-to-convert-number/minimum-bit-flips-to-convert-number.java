class Solution {
    public int minBitFlips(int start, int goal) {
        //XOR will give the bits that are different in start and goal and those bits will be the ones need to flip 
        //just count those bits and done:)

        int ans = start ^ goal;
        int cnt = 0;
        while(ans != 0){
            ans = ans & (ans-1);
            cnt++;
        }
        return cnt;
    }
}