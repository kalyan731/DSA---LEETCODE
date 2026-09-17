class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;

        int maxp = Integer.MIN_VALUE;
        int pre = 1;
        int suff = 1;
        for(int i = 0;i < n;i++){
            if(pre == 0) pre = 1;
            pre *= nums[i];
            maxp = Math.max(maxp,pre);
        }
        for(int i = n-1;i >= 0;i--){
            if(suff == 0) suff = 1;
            suff *= nums[i];
            maxp = Math.max(maxp,suff);
        }
        return maxp;
    }
}