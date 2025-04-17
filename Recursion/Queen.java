//print the index where you can place n queens in a n*n chessboard such that no queen can attack each other
public class Queen {
    public static void main(String[] args) {
        int n = 4;
        int chess[][] = new int[n][n];
        printNqueens(0, chess, "");
    }

    public static void printNqueens(int row, int[][] chess, String ans) {
        // base case
        if (row == chess.length) {
            System.out.println(ans);
            return;
        }
        //recursive case
        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNqueens(row + 1, chess, ans + row + " - " + col + ", ");
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        // 1 -> upside
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // 2 -> right diagonal top
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        // 3 -> left diagonal top
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}


















