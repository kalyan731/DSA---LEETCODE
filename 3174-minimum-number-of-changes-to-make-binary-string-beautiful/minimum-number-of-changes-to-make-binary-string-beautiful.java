class Solution {
    public int minChanges(String s) {
        char curchar = s.charAt(0);
        int minchange = 0;
        int consct = 0;
        for(int i = 0;i < s.length();i++){
            if(curchar == s.charAt(i)){
                consct++;
                continue;
            }
            if(consct % 2 == 0){
                consct = 1;

            }else{
                consct = 0;
                minchange++;
            }
            curchar = s.charAt(i);
        }
        return minchange;
        
    }
}