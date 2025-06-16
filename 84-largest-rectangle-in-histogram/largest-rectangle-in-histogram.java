class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxrect  = 0;
        int prevmin[] = new int[n];
        int nextmin[] = new int[n];
        Stack<Integer> st = new Stack<>();
        //1. prev smallest
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                prevmin[i] = -1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    prevmin[i] = -1;
                }
                else{
                    prevmin[i] = st.peek();
                }
                st.push(i);
            }
        }
        st.clear();
        //2. next smallest
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                nextmin[i] = n;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nextmin[i] = n;
                }
                else{
                    nextmin[i] = st.peek();
                }
                st.push(i);
            }
        }
        
        for(int i=0;i<n;i++){
            int bre = heights[i];
            int len = nextmin[i] - prevmin[i] - 1;
            int rect = len * bre;
            maxrect = Math.max(maxrect , rect);
        }
        return maxrect;
    }
}