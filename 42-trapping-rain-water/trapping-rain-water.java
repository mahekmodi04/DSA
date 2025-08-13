class Solution {
    public int trap(int[] ht) {
        int n = ht.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        //leftmax
        leftmax[0] = ht[0];
        for(int i=1;i<ht.length;i++){
            leftmax[i] = Math.max(leftmax[i-1] , ht[i]);
        }

        rightmax[n-1] = ht[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1] , ht[i]);
        }

        int trapwater = 0;
        for(int i=0;i<ht.length;i++){
            trapwater += Math.min(leftmax[i] , rightmax[i]) - ht[i];
        }
        return trapwater;
    }
}