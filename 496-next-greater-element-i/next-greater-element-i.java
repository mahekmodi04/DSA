class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();

        int res[] = new int[nums2.length];
        int i = nums2.length-1;
        while(i >= 0){
            if(st.isEmpty()){
                res[i] = -1;
                st.push(nums2[i]);
                i--;
            }
            else{
                if(nums2[i] < st.peek()){
                    res[i] = st.peek();
                    st.push(nums2[i]);
                    i--;
                }
                else{
                    while(!st.isEmpty() && nums2[i] > st.peek()){
                        st.pop();
                    }
                    if(!st.isEmpty()){
                        res[i] = st.peek();
                    }
                    else{
                        res[i] = -1;
                    }
                    st.push(nums2[i]);
                    i--;
                }
            }
        }
        for(int j=0;j<nums2.length;j++){
            map.put(nums2[j] , res[j]);
        }

        int temp[] = new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            temp[j] = map.get(nums1[j]);
        }
        return temp;
    }
}