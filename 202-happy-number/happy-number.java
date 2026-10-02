class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(n == 4){
            return false;
        }
        int sum = 0;
        int j = 0;
        while(n > 0){
            j = n % 10;
            n = n/10;
            sum += (int)Math.pow(j,2);
            
        }
        return isHappy(sum);
        
        


    }
}