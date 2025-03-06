class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!hash.containsKey(grid[i][j])){
                    hash.put(grid[i][j] , 1);
                }
                else{
                   
                    arr[0] = grid[i][j];
                    hash.put(grid[i][j] , hash.get(grid[i][j])+1);
                    
                }
            }
        }
        int n = grid.length;
        for(int i=1;i<=n*n;i++){
            if(!hash.containsKey(i)){
                arr[1] = i; 
            }
        }
        return arr;
    }
}