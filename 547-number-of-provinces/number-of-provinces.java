class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count  = 0;
        int rows = isConnected.length;
        int  cols = isConnected[0].length;
        boolean visited[] = new boolean[rows+1];

        for(int i=1;i<visited.length;i++){
            if(!visited[i]){
                count++;
                dfs(isConnected , i, visited);
            }
        }
        return count;
    }
    public static void dfs(int[][] mat , int src , boolean vis[]){
        vis[src]  = true;
        for(int i=0; i< mat[src-1].length;i++){
            if(mat[src-1][i] == 1 && !vis[i+1]){
                dfs(mat ,i+1,vis);
            }
        }

    }
}