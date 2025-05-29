class Solution {
    public int beautySum(String s) {
      int n = s.length();
      int sumdiff =0;

      for(int i=0;i<n;i++){
        int freq[] = new int[26];
        for(int j=i;j<n;j++){
            freq[s.charAt(j) - 'a']++;
        
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int K=0;K<26;K++){
                if(max < freq[K]){max = freq[K];}
                if(freq[K] < min && freq[K] != 0){min = freq[K];}
            }
            int diff = max - min;
            sumdiff += diff;
        }
      }
      return sumdiff;
    }
}