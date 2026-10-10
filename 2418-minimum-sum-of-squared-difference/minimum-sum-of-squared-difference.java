class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        long k = (long) k1 + k2;
        int l = 0, r = max;

        while (l < r) {
            int mid = l + (r - l) / 2;
            long need = 0;

            for (int d : diff) {
                if (d > mid) need += d - mid;
            }

            if (need <= k) r = mid;
            else l = mid + 1;
        }

        int level = l;
        long need = 0, sum = 0;

        for (int d : diff) {
            if (d > level) {
                need += d - level;
                d = level;
            }
            sum += (long) d * d;
        }

        k -= need;

        for (int i = 0; i < n && k > 0; i++) {
            if (diff[i] > 0 && diff[i] <= level) {
                sum -= (long) level * level;
                sum += (long) (level - 1) * (level - 1);
                level--;
                k--;
            }
        }

        // Recalculate safely using remaining operations
        int[] freq = new int[max + 1];
        for (int d : diff) freq[d]++;

        long remaining = (long) k1 + k2;
        for (int d = max; d > 0 && remaining > 0; d--) {
            int use = Math.min(freq[d], (int) Math.min(remaining, Integer.MAX_VALUE));
            freq[d] -= use;
            freq[d - 1] += use;
            remaining -= use;
        }

        long ans = 0;
        for (int d = 0; d < freq.length; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    
    }
}