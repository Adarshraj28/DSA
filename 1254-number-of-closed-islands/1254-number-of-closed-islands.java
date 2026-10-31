class Solution {
    public boolean solve(int grid[][],int i,int j) {
        int n = grid.length;
        int m = grid[0].length;
        if(i < 0 || i >= n || j < 0|| j >= m){
            return false;
        }
        if(grid[i][j] == 1){
            return true;
        }
        grid[i][j] = 1;
        boolean up = solve(grid, i - 1, j);
        boolean down = solve(grid, i + 1, j);
        boolean left = solve(grid, i, j - 1);
        boolean right = solve(grid, i, j + 1);
        return up && left && down && right;
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                if(grid[i][j] == 0){
                    if(solve(grid, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}