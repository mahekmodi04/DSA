class Solution {
    public int minBitFlips(int start, int goal) {
        //do xor of start and goal
        int ans = start ^ goal;
        //the bits that are different -> needs to be flipped-> that we get by counting the no of 1 bits in ans
        int cnt = 0;
        while(ans > 1){
            if((ans %2) == 1)cnt++;
            ans = ans/2;
        }
        if(ans == 1)cnt++;
        return cnt;
    }
}