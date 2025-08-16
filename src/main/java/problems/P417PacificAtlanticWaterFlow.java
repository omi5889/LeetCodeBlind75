package problems;

import java.util.ArrayList;
import java.util.List;

public class P417PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for(int i=0; i<rows; i++) {
            helper(i,0, heights, pacific);
            helper(i,cols-1, heights, atlantic);
        }

        for(int i=0; i<cols; i++) {
            helper(0, i, heights, pacific);
            helper(rows-1, i, heights, atlantic);
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    res.add(List.of(i,j));
                }
            }
        }


        return res;
    }

    private void helper(int r, int c, int[][] heights, boolean[][] isReachable) {
        int[][] directions = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        isReachable[r][c] = true;
        for(int[] dir: directions) {
            int new_r = r + dir[0];
            int new_c = c + dir[1];
            if(new_r < 0 || new_r >= heights.length || new_c < 0 || new_c >= heights[0].length
                    || isReachable[new_r][new_c] || heights[new_r][new_c] < heights[r][c]) {
                continue;
            }
            helper(new_r, new_c, heights, isReachable);
        }
    }
}
