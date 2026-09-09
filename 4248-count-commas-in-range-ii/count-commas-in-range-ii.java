class Solution {
    public long countCommas(long n) {
        
        long count = 0;

if (n < 1000) {
    count = 0;
} else if (n >= 1000 && n <= 999999) {
    count = n - 999;
} else if (n >= 1000000 && n <= 999999999) {
    count = 999000 + 2 * (n - 999999);
} else if (n >= 1000000000 && n <= 999999999999L) {
    count = 1998999000L + 3 * (n - 999999999);
} else if (n >= 1000000000000L && n <= 999999999999999L) {
    count = 2998998999000L + 4 * (n - 999999999999L);
}
else if (n >= 1000000000000000L) {
    count = 3998998998999005L;
}
return count;

        
    }
}