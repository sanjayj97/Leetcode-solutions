class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num : nums){
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(h.keySet());
        Collections.sort(list);
        for(int i = 0; i<list.size() - 1; i++){
            for(int j = i+1; j< list.size(); j++){
                if(h.get(list.get(i)) != h.get(list.get(j))){
                    return new int[]{list.get(i), list.get(j)};
                }
            }
        }
        return new int[]{-1,-1};
    }
}