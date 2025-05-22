class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int prod = 1;
        int maxprod = Integer.MIN_VALUE;
        if(n==1){
            return arr[0];
        }
        for(int i=0;i<n;i++){
            prod = prod * arr[i];
            if(maxprod < prod){
                maxprod = prod;
            }
            if(prod == 0){
                prod = 1;
            }
            
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod = prod * arr[i];
            if(maxprod < prod){
                maxprod = prod;
            }
            if(prod == 0){
                prod = 1;
            }
            
        }
        return maxprod;
    }
}