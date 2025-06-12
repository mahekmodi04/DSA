class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits == null || digits.length() == 0){
            return result;
        }

        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        getcomb(0, digits, map, new StringBuilder() , result);
        return result;
        // Map<Character, String> map = new HashMap<>();
        // map.put('2' , "abc");
        // map.put('3' , "def");
        // map.put('4' , "ghi");
        // map.put('5' , "jkl");
        // map.put('6' , "mno");
        // map.put('7' , "pqrs");
        // map.put('8' , "tuv");
        // map.put('9' , "wxyz");
    }
    private void getcomb(int i, String digits, String[] map, StringBuilder curr, List<String> result){
        if(i == digits.length()){
            result.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(i)-'0'];
        for(int j=0;j<letters.length();j++){
            curr.append(letters.charAt(j));
            getcomb(i+1,digits,map,curr,result);
            curr.deleteCharAt(curr.length()-1);

        }
    }
}