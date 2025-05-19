class Solution {
    public int maxArea(int[] height) {
         int max = 0;
         int n = height.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int len = Math.min(height[i] , height[j]);
        //         int bre = j-i;
        //         int area = len * bre;
        //         if(area > max){
        //             max = area;
        //         }
        //     }
        // }
        int i=0;
        int j = n-1;
        while(i < j){
            int len = Math.min(height[i] , height[j]);
            int bre = j-i;
            int area = len*bre;
            if(area > max){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
         return max;

    }
}