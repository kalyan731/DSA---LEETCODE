class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftQ = 0;
        int rq = 0;
        int ls = 0;
        int rs = 0;
        for(int i = 0; i < n/2;i++){
            if(num.charAt(i) == '?'){
                leftQ++;

            }else{
                ls += num.charAt(i) - '0';
            }
        }
        for(int i = n/2; i < n;i++){
            if(num.charAt(i) == '?'){
                rq++;

            }else{
                rs += num.charAt(i) - '0';
            }
        }
        return 2*(ls - rs) != 9*(rq - leftQ);
        
    }
}