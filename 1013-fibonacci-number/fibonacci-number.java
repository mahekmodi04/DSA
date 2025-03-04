class Solution {
    public int fib(int n) {
        // int fibo = 0;
        // if(n==0 || n==1){
        //     return n;
        // }
        // return fib(n-1) + fib(n-2);
        if(n==1 || n==0){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        int i=2;
        while(i <= n){
            c= a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}