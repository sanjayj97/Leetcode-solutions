class Solution {
    public String reverseWords(String s) {
        String[] w = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = w.length - 1; i>0; i--){
            res.append(w[i]);
            res.append(" ");
        }
        res.append(w[0]);
        return res.toString().trim();
    }
}