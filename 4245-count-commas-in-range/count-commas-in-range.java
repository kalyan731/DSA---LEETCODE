class Solution {
    public int countCommas(int n) {
        int count = (n <= 999)?0:n-999;
        return count;
        
    }
}