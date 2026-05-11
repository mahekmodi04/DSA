class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append ((nums[i]));
        }
        System.out.println (sb);
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < sb.length (); i++) {
            res.add ((int) sb.charAt (i) - '0');
        }
        int[] arr = new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}