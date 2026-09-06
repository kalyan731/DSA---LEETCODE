class Solution {
    public int countRotations(String s, int k) {
        String s1 = s + s;
        int n = s.length();
        int count = 0;
        for(int i = 0;i < n;i++){
            int score = 0;
            for(int j = 0;j < n-1;j++){
                if(s1.charAt(i+j) == s1.charAt(i+j+1)){
                    score++;
                }
            }
            if(score == k){
                count ++; 
            }
        
        
            
        }
       return count;
    }
}