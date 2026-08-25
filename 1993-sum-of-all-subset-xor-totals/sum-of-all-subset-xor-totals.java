class Solution {
    public int subsetXORSum(int[] nums) {
        int to = 0;
        for(int i = 0; i < (1 << nums.length);i++){
            int total = 0;
            for(int j = 0;j < nums.length;j++){
                if((i & (1<<j)) != 0){
                   total ^= nums[j];
                }
            }
            
            to += total;
        }
        return to;
        
    }
}