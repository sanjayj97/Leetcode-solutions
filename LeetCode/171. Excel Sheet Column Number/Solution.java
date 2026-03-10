class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch :columnTitle.toCharArray()){
            sum = sum * 26 + (ch - 'A' + 1);
        }
        return sum;
    }
}