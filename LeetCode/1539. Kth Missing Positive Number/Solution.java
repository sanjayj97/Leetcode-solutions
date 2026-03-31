class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int n = 1;
        while (k > 0){
            if(i < arr.length && arr[i] == n){
                i++;
            }
            else {
                k--;
                if( k == 0){ return n;}
            }
            n++;
        }
        return -1;
    }
}