class Solution {
    public int romanToInt(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(i == s.length()-1){
                if(s.charAt(i) == 'I'){
                    count += 1;
                }
                else if(s.charAt(i) == 'V'){
                    count += 5;
                }
                else if(s.charAt(i) == 'X'){
                    count += 10;
                }
                else if(s.charAt(i) == 'L'){
                    count += 50;
                }
                else if(s.charAt(i) == 'C'){
                    count += 100;
                }
                else if(s.charAt(i) == 'D'){
                    count += 500;
                }
                else{
                    count += 1000; 
                }
            }else{
                if(s.charAt(i) == 'I' &&s.charAt(i+1) == 'V'){
                    count += 4;
                    i++;
                }
                else if(s.charAt(i) == 'I' &&s.charAt(i+1) == 'X'){
                    count += 9;
                    i++;
                }
                else if(s.charAt(i) == 'X' &&s.charAt(i+1) == 'L'){
                    count += 40;
                    i++;
                }
                else if(s.charAt(i) == 'X' &&s.charAt(i+1) == 'C'){
                    count += 90;
                    i++;
                }
                else if(s.charAt(i) == 'C' &&s.charAt(i+1) == 'D'){
                    count += 400;
                    i++;
                }
                else if(s.charAt(i) == 'C' &&s.charAt(i+1) == 'M'){
                    count += 900;
                    i++;
                }
                else if(s.charAt(i) == 'I'){
                    count += 1;
                    
                }
                else if(s.charAt(i) == 'V'){
                    count += 5;
                    
                }
                else if(s.charAt(i) == 'X'){
                    count += 10;
                    
                }
                else if(s.charAt(i) == 'L'){
                    count += 50;
                    
                }
                else if(s.charAt(i) == 'C'){
                    count += 100;
                    
                }
                else if(s.charAt(i) == 'D'){
                    count += 500;
                    
                }
                else{
                    count += 1000; 
                    
                }

            }
            
        }
        return count;
    }
}