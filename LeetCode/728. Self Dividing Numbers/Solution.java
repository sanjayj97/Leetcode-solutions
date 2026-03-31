class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                arr.add(i);
            }
        }
        return arr;

    }
    private boolean isSelfDividing(int num){
        int temp = num;
        while(temp != 0){
            int r = temp % 10;
            if(r == 0 || num % r != 0){
                return false;
            }
            temp = temp / 10;
            if(temp == 0){
                break;
            }
        }
        return true;
    }
}