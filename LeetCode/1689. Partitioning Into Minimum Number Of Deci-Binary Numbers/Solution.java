class Solution {
    public int minPartitions(String n) {
        char m = '0';
        for(int i = 0; i < n.length(); i++){
            char d = n.charAt(i);
            if(d == '9') return 9;
            if(d > m) m = d;
        }
        return m - '0';
    }
}