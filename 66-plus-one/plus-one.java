class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1] != 9){
            digits[n-1] = digits[n-1] + 1; // for 123 it will return 124
        }
        else{
            int m = n+1;
            int newarr[] = new int[m];
            int i = n-1;
            while(i>=0 && digits[i] == 9){//jab tak 9 mil rha hai 
                if(i==0 && digits[0] == 9){//for 999 wala numbers
                    newarr[0] = 1;
                    for(int j=1;j<m;j++){
                        newarr[j] = 0;//inc and return 1000 
                    }
                    return newarr;
                }
                else{
                    digits[i] = 0; // for 129 it will give 130 
                    i--;
                }
                
            }
            int k = i;
            digits[k] = digits[k] + 1;// 2 -> 3 and 9 will become 0 and give 130
        }
        return digits;

    }
}