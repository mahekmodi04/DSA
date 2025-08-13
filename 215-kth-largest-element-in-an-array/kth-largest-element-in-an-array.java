class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int largest = nums[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}