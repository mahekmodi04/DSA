class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        if(a.length-m != n){
            System.out.print("-1");
        }
        int i=m;
        int j=0;
        while(i<a.length && j<n){
            a[i] = b[j];
            i++;
            j++;
        }
        Arrays.sort(a);
        for(i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
            
    }
}