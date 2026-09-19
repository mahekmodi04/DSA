class Solution {
    public int fib(int n) {
         if(n==0) return 0;
         if(n==1)return 1;
        // return fib(n-1) + fib(n-2);

        int a = 0;
        //System.out.print(a);
        int b = 1;
        //System.out.print(b);
        int c = 0;
        int cnt = 1;
        while(cnt != n){
            c = a+b;
           // System.out.print(c);
            a = b;
            b = c;
            cnt++;
        }
        return c;
    }
}