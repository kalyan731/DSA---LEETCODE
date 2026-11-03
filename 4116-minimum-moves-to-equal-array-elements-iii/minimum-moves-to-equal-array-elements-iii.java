class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = nums[nums.length-1];
        int m = 0;
        for(int i = 0;i < n-1;i++){
            int temp = l;
            if(nums[i] != l){
                m += temp - nums[i];
            }
        }
        return m;
        
    }
}