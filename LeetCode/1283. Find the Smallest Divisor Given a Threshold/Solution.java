class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l =1, r = 1000000;
        while(l<r){
            int m  = (l+r)/2;
            int sum = 0;
            for(int e: nums){
                sum += (e + m - 1)/m;
            }
            if(sum <= threshold){
                r = m;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
}