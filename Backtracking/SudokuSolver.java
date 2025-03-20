/*This is only fuctional implementation of Sudoku Game
not taking input in this program
 */

package Backtracking;

public class SudokuSolver{
    public static boolean isSafe(char[][] board, int row, int col, int index){
        for(int i =0; i<board.length; i++){
            if(board[row][i]==index){
                return false;
            }
        }
        for(int i =0; i<board.length; i++){
            if(board[i][col]==index){
                return false;
            }
        }
        int strt_row = 3*(row/3);
        int strt_col = 3*(col/3);
        for(int i=strt_col; i<strt_col+3; i++){
            for(int j=strt_row; j<strt_row+3; j++){
                if(board[strt_row][strt_col]==(char)(index+'0')){
                        return false;
                }
            }
        }
        return true;
    }
    
    public static boolean helper(char[][] board, int row , int col){
        if(row==board.length){
            return true;
        }
        int nrow =0;
        int ncol=0;
        if(col==board.length-1){
            ncol= 0;            
            nrow= row+1;
        }else{
            ncol =col+1;
            nrow= row;
        }

        if(board[row][col]!='.'){
            if(helper(board, nrow, ncol)){
                return true;
            }
        }else{
            for(int i =1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }
                else{
                    board[row][col]='.';
                }
            }
        }}
        return false;
    }
    public static void main(String[] args) {
        int n =9;
        char[][] board = new char[n][n];
    
        helper(board, 0, 0);
       
    }
}