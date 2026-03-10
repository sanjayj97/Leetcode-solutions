class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int l = 0, m = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (h.containsKey(ch)){
                l = Math.max(l, h.get(ch)+1);
            }
            h.put(ch, i);
            m = Math.max(m, i - l + 1);
        }
        return m;
    }
}