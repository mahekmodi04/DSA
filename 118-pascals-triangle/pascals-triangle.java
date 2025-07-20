class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mlist = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        mlist.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = mlist.get(i-1);
            list.add(1);
            for(int j=0;j<prev.size()-1;j++){
                list.add(prev.get(j) + prev.get(j+1));
            }
            list.add(1);
            mlist.add(list);
        }
        return mlist;
    }
}