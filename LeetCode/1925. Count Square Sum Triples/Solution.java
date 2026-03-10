class Solution {
    public int countTriples(int n) {
        int c = 0;
        for(int i = 1; i < n; i++){
            for(int j = i+1; j < n; j++){
                int sum = i*i + j*j;
                int sq = (int)Math.sqrt(sum);
                if(sq * sq == sum && sq <= n){
                    c+=2;
                }
            }
        }
        return c;
    }
}