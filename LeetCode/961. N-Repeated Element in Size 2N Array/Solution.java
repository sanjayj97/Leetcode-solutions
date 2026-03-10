class Solution {
    public int repeatedNTimes(int[] nums) {
        boolean[] seen = new boolean[10001];
        for( int i: nums){
            if (seen[i]){
                return i;
            }
            seen[i] = true;
        }
        return 0;
    }
}