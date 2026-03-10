class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        while(s.length() < k){
            StringBuilder in = invert(s);
            StringBuilder rev = new StringBuilder(in).reverse();
            s.append("1").append(rev);
        }
        return s.charAt(k-1);
    }
    private StringBuilder invert(StringBuilder s){
        StringBuilder ne = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ne.append('0');
            }
            else{
                ne.append('1');
            }
        }
        return ne;
    }
}