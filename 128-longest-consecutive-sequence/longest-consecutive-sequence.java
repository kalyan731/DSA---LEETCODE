class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
        }
        int ans = 0;

        for (int x : set) {
            if (!set.contains(x - 1)) {
                int cur = x, len = 1;

                while (set.contains(cur + 1)) {
                    cur++;
                    len++;
                }

                ans = Math.max(ans, len);
            }
        }

        return ans;
        
    }
}