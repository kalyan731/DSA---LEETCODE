class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] count = new int[10];
        if (n == 0) return 0;
        n = Math.abs(n);

    while (n != 0) {
        count[n % 10]++;
        n /= 10;
    }

    int result = -1;
    for (int d = 0; d < 10; d++) {
        if (count[d] > 0 && (result == -1 || count[d] < count[result])) {
            result = d;
        }
    }
    return result;
    }
}