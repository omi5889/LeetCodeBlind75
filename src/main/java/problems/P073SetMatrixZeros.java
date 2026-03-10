package problems;

public class P073SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        boolean fr = false, fc = false;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<cols; i++) {
            if(matrix[0][i]==0) {
                fr = true;
                break;
            }
        }

        for(int i=0; i<rows; i++) {
            if(matrix[i][0]==0) {
                fc = true;
                break;
            }
        }

        for(int r=1; r < rows; r++) {
            for(int c=1; c < cols; c++) {
                if(matrix[r][c]==0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for(int r=1; r < rows; r++) {
            if(matrix[r][0]==0) {
                for(int c=1; c < cols; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        for(int c=1; c < cols; c++) {
            if(matrix[0][c]==0) {
                for(int r=1; r < rows; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        if(fr) {
            for(int c=0; c < cols; c++) {
                matrix[0][c] = 0;
            }
        }

        if(fc) {
            for(int r=0; r < rows; r++) {
                matrix[r][0] = 0;
            }
        }

    }
}
