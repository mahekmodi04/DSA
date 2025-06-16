class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long maxsum = 0;
        long minsum = 0;
        Stack<Integer> st = new Stack<>();
        int prevmin[] = new int[n];
        int nextmin[] = new int[n];

        int prevmax[] = new int[n];
        int nextmax[] = new int[n];

        //subarray minimums
        //1. prev smallest
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                prevmin[i] = -1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && nums[i] < nums[st.peek()]){
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
                while(!st.isEmpty() && nums[i] <= nums[st.peek()]){
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
            minsum += (long)(i - prevmin[i])* (nextmin[i] - i)* nums[i];
        }
        st.clear();
        //subarray maximums 
        //1.prev greater
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                prevmax[i] = -1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    prevmax[i] = -1;
                }
                else{
                    prevmax[i] = st.peek();
                }
                st.push(i);
            }
        }
        st.clear();
        //2.next greater
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                nextmax[i] = n;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    nextmax[i] = n;
                }
                else{
                    nextmax[i] = st.peek();
                }
                st.push(i);
            }
        }
        for(int i=0;i<n;i++){
            maxsum += (long) (i - prevmax[i])* (nextmax[i] - i)* nums[i];
        }
        return maxsum - minsum;
    }
}