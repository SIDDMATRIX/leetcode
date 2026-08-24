1class Solution {
2    public int numOfWays(int n) {
3        long a = 6;   // ABC
4        long b = 6;   // ABA
5        long mod = 1000000007;
6
7        for (int i = 2; i <= n; i++) {
8            long na = (a * 2 + b * 2) % mod;
9            long nb = (a * 2 + b * 3) % mod;
10
11            a = na;
12            b = nb;
13        }
14
15        return (int)((a + b) % mod);
16    }
17}