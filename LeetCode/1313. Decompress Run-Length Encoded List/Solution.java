class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l = 0;
        for(int i = 0; i < nums.length; i += 2){
            l += nums[i];
        }
        int[] arr = new int[l];
        int idx = 0;
        for(int i = 0; i < nums.length; i += 2){
            int f = nums[i], val = nums[i+1];
            for(int j = 0; j < f; j++){
                arr[idx++] = val;
            }
        }
        return arr;
    }
}