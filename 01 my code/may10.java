public class may10{
    public static void main(String[] args) {
        
    }
    static boolean Solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col  = -1;
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]==0) {
                    row = i;
                    col = j;
                    emptyLeft =false;
                    break;
                }
            }
            if (emptyLeft == false) {
                break;
            }
        }
        // if you found some emepty element in row then break 

        if (emptyLeft == true) {
            return true;
        }
        // sudoku is solved 
        // back track 
        for (int number =1 ; number <=9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (Solve(board)) {
                    // found the answer 
                    display(board);
                    return true;
                }else{
                    //back track
                    board[row][col] =0;
                }
            }
        }
        return false;

    }
    static boolean isSafe(int[][]board,int row,int col,int num){
        // check the row 
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row or not
            if(board[row][col] == num){
                return false;
            }
        }
        // check the column 
        for (int[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;
            }
        }
        // check for the square matrix
        int sqrt=(int)(Math.sqrt(board.length));
        int rowstart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for (int r = rowstart; r <rowstart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
            
        }
        return true;


    }
    static void display(int[][] board){
        for (int[] row : board) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}