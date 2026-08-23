class Solution {
    public String toHex(int num) {
        String hex = "0123456789abcdef";
        String r = "";
        long x;


        if(num < 0){
            x = num& 0XFFFFFFFFL;
        }else{
            x = num;
        }
        if(x == 0){
            return "0";
        }
        while(x != 0){
            int rem = (int)(x % 16);
            r = hex.charAt(rem) + r;
            x = x /16;
        }
        return r;
        
        
    
        
    }
}