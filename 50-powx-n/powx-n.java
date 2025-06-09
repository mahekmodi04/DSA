class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        double pow = n;
        while(pow < 0){
            x = 1/x;
            pow = -pow;
        }
        while(pow != 0){
            if(pow%2 == 0){
                x = x*x;
                pow = pow/2;
            }
            else{
                ans *= x;
                pow = pow-1;
            }
        }
        return ans;
    }
}