package problems;

import java.util.ArrayList;
import java.util.List;

public class P054SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int x = 0;
        int y =0;
        int r = matrix.length;
        int c = matrix[0].length;
        while(r > 0 && c > 0) {
            if(r==1) {
                for(int i=0; i<c; i++) {
                    res.add(matrix[x][y++]);
                }
                break;
            }

            if(c==1) {
                for(int i=0; i<r; i++) {
                    res.add(matrix[x++][y]);
                }
                break;
            }
            for(int i=0; i<c-1; i++) {
                res.add(matrix[x][y++]);
            }
            for(int i=0; i<r-1; i++) {
                res.add(matrix[x++][y]);
            }
            for(int i=0; i<c-1; i++) {
                res.add(matrix[x][y--]);
            }
            for(int i=0; i<r-1; i++) {
                res.add(matrix[x--][y]);
            }
            r -= 2;
            c -= 2;
            x++;
            y++;
        }
        return res;
    }
}
