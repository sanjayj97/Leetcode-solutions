class Solution {
    public int bitwiseComplement(int n) {
        int s = 0;
        int i = 0;
        while(n > 0){
            if((n & 1) != 1){
                s <<= 1;
            }
            else{
                s = (s << 1) & 1;
            }
            n >>=1;
        }
        return s;
    }
}