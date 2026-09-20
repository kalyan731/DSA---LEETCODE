class Solution {
    public int reverseDegree(String s) {
        int product = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            int value = 'z' - ch + 1;
            product = product + (value*(i+1));
        }
        return product;
    }
}