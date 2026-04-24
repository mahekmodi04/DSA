class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rcnt = 0;
        int lcnt = 0;
        int cnt = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'R')rcnt++;
            else if(moves.charAt(i) == 'L')lcnt++;
            else{
                cnt++;
            }
            
        }
        int distance = rcnt - lcnt;
        return Math.abs(distance) + cnt;
    }
}