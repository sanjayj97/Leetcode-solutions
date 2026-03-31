class Solution {
    public void sortColors(int[] nums) {
        int h = nums.length - 1, l = 0, m = 0;
        while (m <= h){
            if(nums[m] == 0){
                int t = nums[m];
                nums[m++] = nums[l];
                nums[l++] = t;
            }
            else if(nums[m] == 2){
                int t = nums[m];
                nums[m] = nums[h];
                nums[h--] = t;
            }
            else{
                m++;
            }
        }
    }
}