class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int k = 1;
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.add(grid[i][j])){
                    ans[0] = grid[i][j];
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int i =0;
        while(k <= n*n){
            if(i< list.size() && k == list.get(i)){
                i++;
                k++;
            }
            else{
                ans[1] = k;
                break;
            }
        }
        return ans;
    }
}