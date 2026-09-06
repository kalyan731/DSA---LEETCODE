class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long ts = 0;
        int count = 0;
        for(int num : nums){
            ts += num;
        }
        int half = n/2;
        long ls = 0;
        for(int i = 0;i < half;i++){
            ls += nums[i];

        }
        for(int k = 0;k < n;k++){
            long rs = ts - ls;
            if(ls > rs){
                count++;
            }
            ls -= nums[k];
            ls += nums[(k+half)%n];
        }
        return count;
    
    }
}