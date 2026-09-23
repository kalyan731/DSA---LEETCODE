class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int lcm = 1;

            for (int j = i; j < nums.length; j++) {

                int a = lcm;
                int b = nums[j];

                // GCD
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }

                // LCM
                lcm = (lcm * nums[j]) / a;

                if (lcm == k) {
                    count++;
                }

                // Once LCM exceeds k, it can never come back to k
                if (lcm > k) {
                    break;
                }
            }
        }

        return count;
    }
}