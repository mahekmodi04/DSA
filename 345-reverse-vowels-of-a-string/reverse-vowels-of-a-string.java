class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
            else if(!isVowel(arr[i]))i++;
            else if(!isVowel(arr[j]))j--;
            else{
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}
}