class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub = new ArrayList<>();
        for(int i = 0; i < (1 << nums.length);i++){
            List<Integer> al = new ArrayList<>();
            for(int j = 0;j < nums.length;j++){
                if((i & (1<<j)) != 0){
                    al.add(nums[j]);
                }
            }
            sub.add(al);
        }
        return sub;
    }
}