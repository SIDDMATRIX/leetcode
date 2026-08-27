class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return lps(s, 0, n - 1, dp);
    }

    public int lps(String s, int si, int ei, int[][] dp) {

        if (si > ei) return 0;
        if (si == ei) return 1;

        if (dp[si][ei] != -1)
            return dp[si][ei];

        if (s.charAt(si) == s.charAt(ei))
            return dp[si][ei] = 2 + lps(s, si + 1, ei - 1, dp);

        return dp[si][ei] = Math.max(
            lps(s, si + 1, ei, dp),
            lps(s, si, ei - 1, dp)
        );
    }
}