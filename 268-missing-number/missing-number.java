class Solution {
    public int missingNumber(int[] arr) {
       
        
        Arrays.sort(arr);
         int k = 0;
        for(int i=0;i<arr.length;i++){
            if(k != arr[i])return k;
            else{
                k++;
            }
            
        }
        return k;
    }
}