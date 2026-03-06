class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] lights = new int[101];
        for(int b: bulbs){
            lights[b] ^=1;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i<=100; i++){
            if(lights[i] == 1){
                res.add(i);
            }
        }
        return res;
    }
}