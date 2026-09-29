class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int gcd = 0;

            for (int j = i; j < nums.length; j++) {

                int a = gcd;
                int b = nums[j];

                // GCD
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                gcd = a;

                
                

                if (gcd == k) {
                    count++;
                }

                // Once LCM exceeds k, it can never come back to k
                if (gcd < k) {
                    break;
                }
            }
        }

        return count;
        
    }
}