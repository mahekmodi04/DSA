class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        mainlist.add(firstrow);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> prevlist = mainlist.get(i-1);
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(prevlist.get(j-1) + prevlist.get(j));
            }
            list.add(1);
            mainlist.add(list);
        }
        return mainlist.get(rowIndex);
    }
}