class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int count = hm.getOrDefault(nums[i], 0) + 1;
            hm.put(nums[i],count);
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}