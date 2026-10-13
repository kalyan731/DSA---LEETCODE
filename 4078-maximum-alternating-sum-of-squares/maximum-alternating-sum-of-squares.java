class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];
        for (int k = 0; k < n; k++) {
            sq[k] = (long) nums[k] * nums[k];
        }
        Arrays.sort(sq);

        long score = 0;
        int i = 0, j = n - 1;
        while (i < j) {
            score += sq[j] - sq[i];
            i++;
            j--;
        }
        if (i == j) {
            score += sq[i]; // odd length: middle element lands in a positive slot
        }
        return score;
    
    }
}