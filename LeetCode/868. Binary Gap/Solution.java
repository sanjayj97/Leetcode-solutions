class Solution {
    public int binaryGap(int n) {
        int max_dis = 0;
        int prev_one = -1;
        int i = 0;
        while(n > 0){
            if((n & 1)== 1){
                if( prev_one != -1){
                    max_dis = (max_dis > i-prev_one)? max_dis: i-prev_one;
                }
                prev_one = i;
            }
            n >>= 1;
            i++;
        }
        return max_dis;
    }
}