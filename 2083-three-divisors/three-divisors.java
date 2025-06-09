class Solution {
    public boolean isThree(int n) {
        for(int i=2;i<n;i++){
            if(n % i == 0){
                if(n/i == i){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}