class Solution {
    public int countAsterisks(String s) {
        boolean inBar = false;
        int ast = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') {
                inBar = !inBar;
            } else if (c == '*' && !inBar) {
                ast++;
            }
        }
        return ast;
    }
}
