class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int med = nums[n/2];
        int mov = 0;
        for(int i= 0;i < n;i++){
           mov += Math.abs(med - nums[i]); 
        }
        return mov;
    }
}