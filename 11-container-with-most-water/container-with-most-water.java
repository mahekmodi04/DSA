class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int area = 0;
        int max = Integer.MIN_VALUE;

        while(i <= j){
            int len = j-i;
            area = len * Math.min(height[i],height[j]);
            max = Math.max(area , max);
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