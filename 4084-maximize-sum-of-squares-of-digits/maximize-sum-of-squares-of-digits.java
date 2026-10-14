class Solution {
    public String maxSumOfSquares(int num, int sum) {
      StringBuilder sb=new StringBuilder("");
        if(sum>num*9){
            return sb.toString();
        }
        for(int i=9;i>=0;i--){
            while(sum>=i){
                if(sb.length()<num){
                    sb.append(i);
                }else{
                    break;
                }
             sum-=i;
            }
        }
        return sb.toString();  
    }
}