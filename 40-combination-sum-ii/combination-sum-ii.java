class Solution {
    private void findcomb(int ind, int arr[], int target , List<List<Integer>>ans ,List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]){
                continue;
            }
            if(arr[i] <= target){
                ds.add(arr[i]);
                findcomb(i+1, arr, target - arr[i], ans ,ds);
                ds.remove(ds.size()-1);
            }
            if(arr[i] > target){
                break;
            }
        }  
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
         List<List<Integer>> ans = new ArrayList<>();
         findcomb(0,candidates ,target,ans, new ArrayList<>());
         return ans;
    }
    
}