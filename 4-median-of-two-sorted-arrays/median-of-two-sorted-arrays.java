class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int newarr[] = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                newarr[k] = nums1[i];
                i++;
                k++;
            }
            else if(nums1[i] > nums2[j]){
                newarr[k] = nums2[j];
                j++;
                k++;
            }
            else{
                newarr[k] = nums1[i];
                k++;
                i++;
                newarr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<n && k < newarr.length){
            newarr[k] = nums1[i];
            k++;
            i++;
        }
        while(j<m && k < newarr.length){
            newarr[k] = nums2[j];
            k++;
            j++;
        }
        int size = newarr.length;
        if(size %2 !=0){
            int ele = (size+1)/2;
            return newarr[ele-1];
        }
        else{
            int ele = size/2;
            return (newarr[ele-1] + newarr[ele])/2.0;
        }

    }
}