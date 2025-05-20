class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> mainlist = new ArrayList<>();
       List<Integer> firstrow = new ArrayList<>();
       firstrow.add(1);
       mainlist.add(firstrow);
       for(int i=1;i<=rowIndex;i++){
            List<Integer> prev = mainlist.get(i-1);
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1;j<prev.size();j++){
                list.add(prev.get(j-1) + prev.get(j));
            }
            list.add(1);

            mainlist.add(list);

       }
       return mainlist.get(rowIndex);
    }
}