class Solution {
    public int countDigits(int num) {
        int s = 0;
        int temp = num;
        while(temp > 0){
            int r = temp % 10;
            if( num % r == 0){
                s++;
            }
            temp /= 10;    
        }
        return s;
    }
}