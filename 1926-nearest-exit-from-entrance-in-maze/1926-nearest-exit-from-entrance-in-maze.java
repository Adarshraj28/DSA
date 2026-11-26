class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';
        int[][] d = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
        while (!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int step = curr[2];
            for (int[] dir : d){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n){
                    continue;
                }
                if (maze[nr][nc] == '+'){
                    continue;
                }
               if (nr == 0 || nc == 0 || nr == m - 1 || nc == n - 1){
                    return step + 1;
                }
                maze[nr][nc] = '+';
                q.offer(new int[]{nr, nc, step + 1});
            }
        }
        return -1;
    }
}