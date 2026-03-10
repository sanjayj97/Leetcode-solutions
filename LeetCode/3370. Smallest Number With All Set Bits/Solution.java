class Solution {
    public int smallestNumber(int n) {
        int ne = 0;
        while(n > 0){
            ne = (ne << 1) | 1;
            n /=2;
        }
        return ne;
    }
}