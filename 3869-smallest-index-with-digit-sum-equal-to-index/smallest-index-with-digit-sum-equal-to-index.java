class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            int n = nums[i];
            int digit = 0;
            while(n > 0){
                int rem = n % 10;
                digit = digit + rem;
                n = n/10;
            }
            if(digit == i){
                min = Math.min(digit,min);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
        
    }
}