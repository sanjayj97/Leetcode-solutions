class Solution {
    public int[] applyOperations(int[] nums) {
        int i = 0;
        while(i < nums.length -1 ){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
                i+=2;
            }
            else{
                i++;
            }
        }
        int k = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int t = nums[j];
                nums[j] = nums[k];
                nums[k] = t;
                k++;
            }
        }
        return nums;
    }
}