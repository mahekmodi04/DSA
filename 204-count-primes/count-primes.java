class Solution {
    public int countPrimes(int n) {
        //sieve of eratosthanes
        if(n <= 2){
            return 0;
        }
        int count = 0;
        int primes[] = new int[n];
        for(int i=2;i<n;i++){
            primes[i] = 1;
        }
        //algo is here to mark all the multiples of prime number as 0 because they cant be prime
        for(int i=2;i*i < n;i++){
            if(primes[i] == 1){
                
                for(int j=i*i;j<n;j=j+i){
                    primes[j] = 0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i] == 1)count++;
        }

        return count;
    }
}