class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , Comparator.comparingDouble(o -> o[1]));

        int include = intervals[0][0];
        int exclude = 0;
        int lastend = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if( intervals[i][0] >= lastend){
                lastend = intervals[i][1];
                include = intervals[i][0];
            }
            else{
                exclude++;
            }

        }
        return exclude;
    }
}