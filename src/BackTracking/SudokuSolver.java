package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        print(board);

        solveSudoku(board);

        System.out.println();
        print(board);

    }

    public static boolean solve(char[][] board, int row, int col){
        // base case
        if (row == 9){
            //print(board);
            return true;
        }
        if(board[row][col] != '.'){
            if(col < 8) return solve(board, row, col+1);
            else return solve(board, row+1, 0);
        }
        else{
            for(char ch='1'; ch<='9'; ch++){
                if(isSafe(board, row, col, ch)){
                    board[row][col] = ch;
                    boolean isSolve;
                    if(col < 8) isSolve = solve(board, row, col+1);
                    else isSolve = solve(board, row+1, 0);
                    if (isSolve) return true;
                    board[row][col] = '.'; //back Tracking
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col, char num){
        // check row
        for(int j=0; j<9; j++){
            if(board[row][j] == num) return false;
        }

        // check col
        for(int i=0; i<9; i++){
            if(board[i][col] == num) return false;
        }

        // check in 3*3 matrix
        int sRow = row/3*3;
        int sCol = col/3*3;

        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(board[i][j] == num) return false;
            }
        }

        return true;

    }
    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    public static void print(char[][] board){

        for (int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
