class Solution {
    public int subsetXORSum(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result |= nums[i];
        }
        return result << (nums.length-1);
        
    }
}