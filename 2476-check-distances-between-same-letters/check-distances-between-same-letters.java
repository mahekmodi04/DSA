class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int first_ind[] = new int[26];
        Arrays.fill(first_ind , -1);

        for(int i=0;i<s.length();i++){
            if(first_ind[s.charAt(i) - 'a'] == -1){
                first_ind[s.charAt(i) - 'a'] = i;
            }
            else{
                int diff = i - first_ind[s.charAt(i) - 'a'] - 1;
                if(distance[s.charAt(i) - 'a'] != diff){
                    return false;
                }
            }

        }
        return true;

    }
}