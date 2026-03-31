class Solution {
    public long countCommas(long n) {
        long[] thresh = {1_000L,
                        1_000_000L,
                        1_000_000_000L,
                        1_000_000_000_000L,
                        1_000_000_000_000_000L};
        long t = 0;
        for(int i = 0; i < thresh.length; i++){
            if(n >= thresh[i]){
                long upper = i + 1 < thresh.length ? thresh[i + 1] - 1 : n;
                upper = Math.min(n,upper);
                t += (upper - thresh[i] + 1) * (i + 1);
            }
        }
        return t;
    }
}