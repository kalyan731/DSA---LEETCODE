class Solution {
    public long maxPairStrength(int[] nums) {
        long max = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                long sum = (long)nums[i]*nums[j];
                long g = gcd(nums[i],nums[j]);
                max = Math.max(max,sum/(g*g));
            }
        }
        return max;
    }
    public long gcd(long a,long b){
        a = Math.abs(a);
        b = Math.abs(b);
      
        while(b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}