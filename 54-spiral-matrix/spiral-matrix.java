class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int first = 0;
        int last = n-1;
        int left = 0;
        int right = m-1;
        while(first <= last && left <= right){
            //top
            int i = first;
            for(int j=left;j<=right;j++){
                list.add(matrix[i][j]);
            }
            //right
            int j=right;
            for(i=first+1 ; i<=last;i++){
                list.add(matrix[i][j]);
            }
            //bootom
            if(first < last){
                i = last;
                for(j = right - 1;j >= left ; j--){
                    list.add(matrix[i][j]);
                }

            }

            if(left < right){
                j = left;
                for(i = last - 1;i > first;i--){
                    list.add(matrix[i][j]);
                }
            }
            first++;
            last--;
            left++;
            right--;
        }
        return list;
    }
}