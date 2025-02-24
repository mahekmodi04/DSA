class Solution {
    public String addBinary(String a, String b) {
        StringBuilder  str = new StringBuilder();
        int carry = 0;
        int i=a.length()-1;
        int j = b.length()-1;
       while(i>=0 || j>=0|| carry> 0){
        int sum = carry;//take carry from prev bit , initally take 0
           if(i>=0){ // here first it will check if ith element is present 
            sum += a.charAt(i)-'0';//if yes then it will add with the prev carry(sum ) + ith character and convert to int
            i--;//next element piche
           }
           if(j>=0){
            sum += b.charAt(j)-'0';//same like a 
            j--;//next element piche

            //sum will be in the integer form so answer will 0/1/2/3 max 0->0, 1->1, 2->0 , 3->1;
           }
           str.append(sum % 2); // remainder is either 0 /1 so it is binary so if sum = 2 then (1+1) it will append 0; and then carry will be 1
           carry = sum/2; // for sum = 3 or 2 then carry is 1 bcozz 1 + 1 OR 1+1+1

       } 
       return str.reverse().toString(); // reverse it and then convert to string
    }
}