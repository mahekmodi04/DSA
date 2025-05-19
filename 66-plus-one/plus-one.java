class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] = digits[n-1] + 1;
        }
        else{
            int m = n+1;
            int arr[] = new int[m];
            int i=n-1;
            while(i>=0 && digits[i] == 9){
                if(i==0 && digits[0] == 9){
                    arr[0] = 1;
                    for(int j=1;j<m;j++){
                        arr[j] = 0;
                    }
                    return arr;
                }
                else{
                    digits[i] = 0;
                    i--;
                }  
                }
                digits[i] = digits[i] +1;
                

            
        }
        return digits;
    }
}