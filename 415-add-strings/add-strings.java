class Solution {
    public String addStrings(String num1, String num2) {
        int  i = num1.length()-1,j = num2.length()-1;;
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
      
        while(i >= 0 || j >= 0 || carry != 0){
            int a = (i >= 0)?num1.charAt(i) -'0':0;
            int b = (j >= 0)?num2.charAt(j) -'0':0;
            int res = a + b + carry;
            sb.append(res%10);
            carry = res/10;
            i--;
            j--;
            
        }
        return sb.reverse().toString();
        
    }
}