class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        boolean ch = true;
        while(ch){
            ch = false;
            for(int i = 0; i < sb.length(); i++){
                for(int j = i + 1; j < sb.length() && j - i <= k; j++){
                    if(sb.charAt(i) == sb.charAt(j)){
                        sb.deleteCharAt(j);
                        ch = true;
                        break;
                    }
                }
                if(ch){
                    break;
                }
            }
        }
        return sb.toString();
    }
}