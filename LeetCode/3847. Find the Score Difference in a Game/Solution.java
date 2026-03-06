class Solution {
    public int scoreDifference(int[] nums) {
        int[] arr= {0,0};
        int p = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                p = (p == 0)? 1: 0;
            }
            if(i % 6 == 5){
                p = (p == 0)? 1: 0;
            }
            arr[p] += nums[i];
        }
        return arr[0] - arr[1];
    }
}