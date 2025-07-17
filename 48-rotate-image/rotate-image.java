class Solution {
    public void rotate(int[][] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //col swap
        int i = 0;
        int j = arr[0].length - 1;
        
        while(i<j){
            int k = 0;
            while(k < arr.length ){
            int temp = arr[k][i];
            arr[k][i] = arr[k][j];
            arr[k][j] = temp;
            k++;
            }
            i++;
            j--;
        }
    }
}