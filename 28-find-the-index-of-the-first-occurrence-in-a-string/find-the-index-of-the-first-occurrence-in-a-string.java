//more efficient code 

class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();
        int k = 0;
        for(int i=0;i<n;i++){
            if(haystack.charAt(i)==needle.charAt(0)){//we dont check for each substring of haystack instead we check if the starting value of needle matches with which index of haystack 
                k = i;//assign that index to k 
                if(k+m <= n){//check for substring if k+m is still a partfo haystack string if not return -1
                String substr = haystack.substring(k,k+m); // create a substring from that k index where the character matches to the length of needle which is k+m 
                    if(substr.equals(needle)){ // if both strings are exactly same then it will return k which is the initial index 
                        return k;
                    }
                    //else it will increment and check for next character if matches needle(0) and repeat 
                }
                
            }
        }
        return -1;//if nothing matches with needle(0) then return -1
    }
}