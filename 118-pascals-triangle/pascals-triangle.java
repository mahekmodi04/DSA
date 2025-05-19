class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        mainlist.add(list);
    
        for(int i=1;i<numRows;i++){
             List<Integer> newlist = new ArrayList<>();
             newlist.add(1);
             List<Integer>prev = mainlist.get(i-1);
             for(int j=1;j<prev.size();j++){
                newlist.add(prev.get(j-1) + prev.get(j));
             }
             newlist.add(1);
             mainlist.add(newlist);
        }
        return mainlist;
    }


}