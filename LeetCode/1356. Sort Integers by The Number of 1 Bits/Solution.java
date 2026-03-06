class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                int bitj = Integer.bitCount(arr[j]);
                int bitj1 = Integer.bitCount(arr[j+1]);
                if(bitj > bitj1 || (bitj == bitj1 && arr[j] > arr[j+1])){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }            
        }
        return arr;
    }
}