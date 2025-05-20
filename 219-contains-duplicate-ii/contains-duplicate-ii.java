class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        //method1

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             if(Math.abs(i-j) <=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        //method 2

    //     int i=0;
    //     int j=n-1;
    //     while(i<j){
    //         if(nums[i] == nums[j] && Math.abs(i-j) <=k){
    //             return true;
    //         }
    //         else{
    //             i++;
    //             j--;
    //         }
    //     }
    //     return false;
    // }

    //methode3
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i =0;i<n;i++){
        if(map.containsKey(nums[i])){
            if(i - map.get(nums[i]) <=k){
                return true;
            }
        }
        map.put(nums[i],i);
    }
    return false;
}

}