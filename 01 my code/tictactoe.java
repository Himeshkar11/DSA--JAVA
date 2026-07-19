import java.util.Scanner;

public class tictactoe {

    static final int SIZE = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        System.out.println("=================================");
        System.out.println("        TIC TAC TOE");
        System.out.println("=================================");
        System.out.println("Player 1 : X");
        System.out.println("Player 2 : O");
        System.out.println();

        while (playAgain) {

            char[][] board = initializeBoard();

            char currentPlayer = 'X';
            boolean gameOver = false;

            while (!gameOver) {

                printBoard(board);

                System.out.println("Player " + currentPlayer + "'s Turn");

                int row, col;

                while (true) {

                    System.out.print("Enter Row (0-2): ");
                    row = scanner.nextInt();

                    System.out.print("Enter Column (0-2): ");
                    col = scanner.nextInt();

                    // Check valid range
                    if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                        System.out.println("\nInvalid Position! Please enter values between 0 and 2.\n");
                        continue;
                    }

                    // Check empty cell
                    if (board[row][col] != ' ') {
                        System.out.println("\nThat position is already occupied!\n");
                        continue;
                    }

                    break;
                }

                board[row][col] = currentPlayer;

                if (hasWon(board, currentPlayer)) {

                    printBoard(board);

                    System.out.println("\n=================================");
                    System.out.println(" Player " + currentPlayer + " Wins!");
                    System.out.println("=================================");

                    gameOver = true;

                } else if (isBoardFull(board)) {

                    printBoard(board);

                    System.out.println("\n=================================");
                    System.out.println("        Match Draw!");
                    System.out.println("=================================");

                    gameOver = true;

                } else {

                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("\nPlay Again? (Y/N): ");
            char choice = scanner.next().toUpperCase().charAt(0);

            playAgain = (choice == 'Y');
        }

        System.out.println("\nThanks for Playing!");

        scanner.close();
    }

    // Initialize Board
    private static char[][] initializeBoard() {

        char[][] board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                board[i][j] = ' ';
            }
        }

        return board;
    }

    // Print Board
    private static void printBoard(char[][] board) {

        System.out.println();

        System.out.println("     0   1   2");

        for (int i = 0; i < SIZE; i++) {

            System.out.print(i + "  ");

            for (int j = 0; j < SIZE; j++) {

                System.out.print(" " + board[i][j] + " ");

                if (j != SIZE - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i != SIZE - 1) {
                System.out.println("   ---+---+---");
            }
        }

        System.out.println();
    }

    // Check Winner
    private static boolean hasWon(char[][] board, char player) {

        // Rows
        for (int i = 0; i < SIZE; i++) {

            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {

                return true;
            }
        }

        // Columns
        for (int j = 0; j < SIZE; j++) {

            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player) {

                return true;
            }
        }

        // Main Diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {

            return true;
        }

        // Secondary Diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {

            return true;
        }

        return false;
    }

    // Check Draw
    private static boolean isBoardFull(char[][] board) {

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
}