class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i < (1 << n); i++){
            arr.add(i^(i>>1));
        }
        return arr;
    }
}
