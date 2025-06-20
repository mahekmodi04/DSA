class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int n = nums.length;
        
        int og = k;

        //to make 1 
        int i=0;
        int temp1[] = nums.clone();
        int cnt1 = 0;
        while(i<n-1 && cnt1 <= k){
            if(temp1[i] == -1){
                temp1[i] = 1;
                temp1[i+1]  = -1* temp1[i+1];
                
                cnt1++;
            }
            i++;
        }
        boolean isone = false;
        if(i==n-1 && temp1[i] == 1 && cnt1 <= k){
           isone = true;
        }

        //to make -1 
        
        int temp2[] = nums.clone();
        int cnt2 = 0;
        i=0;
        while(i<n-1 && cnt2 <= k){
            if(temp2[i] == 1){
                temp2[i] = -1;
                temp2[i+1]  = -1* temp2[i+1];
                cnt2++;
            }
            i++;
        }
        boolean isminus = false;
        if(i==n-1 && temp2[i] == -1 && cnt2 <=k ){
           isminus = true;
        }
        
        if(isone == true || isminus == true){
            return true;
        }
        return false;
    }
}