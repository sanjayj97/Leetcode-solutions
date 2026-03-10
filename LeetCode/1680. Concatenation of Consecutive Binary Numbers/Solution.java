class Solution {
    public int concatenatedBinary(int n) {
        int MOD = 1000000007;
        long r = 0;
        int l = 0;
        int next = 1;
        for(int i = 1; i < n+1; i++){
            if (i == next){
                l+=1;
                next <<= 1;
            }
            r = ((r << l) | i) % MOD;
        }
        return (int)r;
    }
}