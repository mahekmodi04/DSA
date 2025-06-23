class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , Comparator.comparingDouble(o -> o[0]));

        ArrayList<List<Integer>> mainlist = new ArrayList<>();
        int prevfirst = intervals[0][0];
        int prevlast = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
           
            if(intervals[i][0] <= prevlast){
                prevlast = Math.max(prevlast,intervals[i][1]);
            }
            else{
                 ArrayList<Integer> list = new ArrayList<>();
                list.add(prevfirst);
                list.add(prevlast);
                mainlist.add(list);
                prevfirst = intervals[i][0];
                prevlast = intervals[i][1];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(prevfirst);
        list.add(prevlast);
        mainlist.add(list);

        int[][] arr = new int[mainlist.size()][2];
        for (int i = 0; i < mainlist.size(); i++) {
            arr[i][0] = mainlist.get(i).get(0);
            arr[i][1] = mainlist.get(i).get(1);
        }
        return arr;
    }
}