class Solution {
    public long removeZeros(long n) {
        StringBuilder s = new StringBuilder();
        s.append(n);
        int i = 0;
        while( i < s.length()){
            if(s.charAt(i) == '0'){
                s.deleteCharAt(i);
            }
            else{
                i++;
            }
        }
        return Long.parseLong(s.toString());  
    }
}