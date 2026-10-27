class Solution {
    public String[] createGrid(int m, int n) {
        char[][] g = new char[m][n];
        for (char[] row : g) Arrays.fill(row, '#');

        int i = 0, j = 0;
        g[0][0] = '.';
        boolean right = true;

        while (i != m - 1 || j != n - 1) {
            if (i == m - 1) {
                j++;
            } else if (j == n - 1) {
                i++;
            } else if (right) {
                j++;
                right = false;
            } else {
                i++;
                right = true;
            }
            g[i][j] = '.';
        }

        String[] res = new String[m];
        for (int r = 0; r < m; r++) res[r] = new String(g[r]);
        return res;
    }
}