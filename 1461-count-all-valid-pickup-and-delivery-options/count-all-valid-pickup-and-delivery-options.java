class Solution {
    public int countOrders(int n) {
        long res = 1;
        long mod = 1_000_000_007;
        for (int i =1; i<=n;i++){
            res = (res*i*(2* i-1))%mod ;
        }
        return (int) res ;
        
    }
}