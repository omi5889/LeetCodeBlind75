package problems;

public class P079WordSearch {
    public boolean exist(char[][] board, String word) {
        if(word==null || word.isEmpty()) return false;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(helper(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int step, int row, int col) {
        if(step==word.length()) return true;
        if(row<0 || row >= board.length || col<0 || col >= board[0].length) return false;
        if(board[row][col] - word.charAt(step) !=0 ) return false;

        char temp = board[row][col];
        board[row][col] = '1';
        boolean res = helper(board, word, step+1, row-1, col) ||
                helper(board, word, step+1, row+1, col) ||
                helper(board, word, step+1, row, col-1) ||
                helper(board, word, step+1, row, col+1);
        board[row][col] = temp;
        return res;
    }
}
