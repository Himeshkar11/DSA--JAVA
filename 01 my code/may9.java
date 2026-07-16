public class may9 {

    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        Knights(board, 0, 0, n);
    }

    static void Knights(boolean[][] board, int row, int col, int Knight) {
        if (Knight == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            Knights(board, row + 1, col, Knight);
            return;
        }

        // place the Knight if it is safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Knights(board, row, col + 1, Knight - 1);
            // back tracking
            board[row][col] = false;
        }
        Knights(board, row, col + 1, Knight - 1);

    }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}