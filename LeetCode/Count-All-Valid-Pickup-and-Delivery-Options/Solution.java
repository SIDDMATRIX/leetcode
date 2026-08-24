1class Solution {
2    public int countOrders(int n) {
3        long res = 1;
4        long mod = 1_000_000_007;
5        for (int i =1; i<=n;i++){
6            res = (res*i*(2* i-1))%mod ;
7        }
8        return (int) res ;
9        
10    }
11}