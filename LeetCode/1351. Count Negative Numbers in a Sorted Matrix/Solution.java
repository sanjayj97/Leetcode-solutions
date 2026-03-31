class Solution {
    public int countNegatives(int[][] grid) {
        int c = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++){
            int j = 0;
            while(j < n && grid[i][j] >= 0){
                j++;
            }
            c += (n-j);
        }
        return c;
    }
}