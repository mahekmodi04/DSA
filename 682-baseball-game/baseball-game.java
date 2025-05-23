class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String curr = operations[i];
            if(curr.matches("-?\\d+")){//regex for integers - "-?\\d+"
                int num = Integer.parseInt(curr);
                list.add(num);
            }
            else if(curr.equals("+")){//use .equals for checking the strings
                int num = list.get(list.size()-2) + list.get(list.size()-1);
                list.add(num);
            }
            else if(curr.equals("D")){
                int num = 2* list.get(list.size()-1);
                list.add(num);
            }
            else{
                if(i != 0){
                    list.remove(list.size()-1);//dont use i-1 instead use list.size() -1
                }
                
            }
        }
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }
}