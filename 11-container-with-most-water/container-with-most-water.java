class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int max= 0;
        while(i<=j){
            int len = j-i;
            int bre = Math.min(height[i],height[j]);
            int area = len * bre;
            max = Math.max(max , area);
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