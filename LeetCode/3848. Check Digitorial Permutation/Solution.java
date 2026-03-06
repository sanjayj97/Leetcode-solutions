class Solution {
    private static final int[] FACT = {1,1,2,6,24,120,720,5040,40320,362880};

    public boolean isDigitorialPermutation(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int r = n % 10;
            sum += FACT[r];
            n /= 10;
        }
        if ( sum == temp){
            return true;
        }
        return isPermutation(sum, temp);
    }
    private boolean isPermutation(int a, int b) {
        int[] countA = new int[10];
        int[] countB = new int[10];

        while(a > 0){
            countA[a % 10]++;
            a /= 10;
        }
        while(b > 0){
            countB[b % 10]++;
            b /= 10;
        }

        for(int i = 0; i < 10; i++){
            if(countA[i] != countB[i]) return false;
        }
        return true;
    }
}