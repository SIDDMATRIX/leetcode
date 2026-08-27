class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp.length; j++) {
                dp[i][j] = -1;
            }
        }
        return lps(s, 0, s.length() - 1, dp);
    }
    public int lps(String s, int si, int ei, int[][] dp) {
        if(si >= ei) return (si == ei) ? 1 : 0;
        if(dp[si][ei] != -1) return dp[si][ei];
        if(s.charAt(si) == s.charAt(ei)) {
            int recAns = lps(s, si + 1, ei - 1, dp);
            dp[si][ei] = recAns + 2;
            return recAns + 2;
        }else {
            int skipS = lps(s, si + 1, ei, dp);
            int skipE = lps(s, si, ei - 1, dp);
            dp[si][ei] = Math.max(skipS, skipE); 
            return Math.max(skipS, skipE);
        }
    }
}