class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] ans = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }

        while (i < n) {
            ans[k++] = a[i++];
        }

        while (j < m) {
            ans[k++] = b[j++];
        }

        int len = ans.length;
        if (len % 2 == 0) {
            return (ans[len / 2] + ans[(len / 2) - 1]) / 2.0;
        } else {
            return ans[len / 2];
        }
    }
}
