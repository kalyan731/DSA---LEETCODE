class Solution {
    public int maxSum(int[][] grid) {
        
        int m = grid.length, n = grid[0].length;
        int best = Integer.MIN_VALUE;

        for (int i = 0; i + 2 < m; i++) {
            for (int j = 0; j + 2 < n; j++) {
                int s = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                      + grid[i + 1][j + 1]
                      + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                best = Math.max(best, s);
            }
        }
        return best;
    }
}