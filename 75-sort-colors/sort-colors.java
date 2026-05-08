class Solution {
    public void sortColors(int[] arr) {
        int mid = 0;
        int high =arr.length-1;
        int low = 0;
        while(mid <= high){
            if(arr[mid] == 2){
                //swap high and mid
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
            }
            else if(arr[mid] == 0){
                //swap low and mid
                int t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
}