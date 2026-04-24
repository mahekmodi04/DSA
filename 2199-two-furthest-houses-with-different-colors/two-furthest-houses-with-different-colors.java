class Solution {
    public int maxDistance(int[] colors) {
        int max1 = 0;
        int dist1 = 0;
        int i=0;
        int j=colors.length-1;
        while(i<=j){
            if(colors[i] == colors[j])j--;
            else{
                dist1 = j-i;
                max1 = Math.max(max1 , dist1);
                j--;
            }

        }
        i=0;
        j=colors.length-1;
        int max2 = 0;
        int dist2 = 0;
        while(i<=j){
            if(colors[i] == colors[j])i++;
            else{
                dist2 = j-i;
                max2 = Math.max(max2 , dist2);
                i++;
            }

        }
        return Math.max(max1,max2);
        
    }
}