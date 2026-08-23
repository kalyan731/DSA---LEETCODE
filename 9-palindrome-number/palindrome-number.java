class Solution {
    public boolean isPalindrome(int x) {

        String n = String.valueOf(x);
        int l = 0;
        int r = n.length()-1;
        while(l < r){
            if(n.charAt(l) != n.charAt(r) ){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}