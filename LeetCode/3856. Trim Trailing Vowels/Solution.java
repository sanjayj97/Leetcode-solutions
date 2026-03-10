class Solution {
    public String trimTrailingVowels(String s) {
        int last = s.length() -1;
        while (last >= 0 && isVowel(s.charAt(last))){
            last--;
        }
        return s.substring(0, last+1);
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}