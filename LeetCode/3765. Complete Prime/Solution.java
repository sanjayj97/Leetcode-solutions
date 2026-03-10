class Solution {
    public boolean completePrime(int num) {
        if (!isPrime(num)) return false;

        int temp = num;
        int divisor = 1;

        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }

        int prefix = 0;
        int n = num;

        while (divisor > 0) {
            prefix = prefix * 10 + (n / divisor);
            if (!isPrime(prefix)) return false;

            int suffix = num % (divisor * 10);
            if (!isPrime(suffix)) return false;

            n %= divisor;
            divisor /= 10;
        }

        return true;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}