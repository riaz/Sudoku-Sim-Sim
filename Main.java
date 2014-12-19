package Sudoku-Sim-Sim;

/**
 * Sudoku Sim-Sim.
 * It creates a GUI with a default puzzle; you can replace it with the puzzle
 * you want to solve. Then click the 'Start' button (or type 'ALT-s') to get the
 * solution.
 *
 * @author Munshi Riaz
 * @version 1.0
 */
public class Main {
    
    /**
     * Creates the GUI with a default puzzle. 
     */
    public static void main(String[] args) {
        int[][] board = {{1, 7, 0, 8, 0, 0, 0, 0, 9},
                         {0, 0, 6, 0, 1, 0, 0, 0, 7},
                         {0, 0, 0, 0, 0, 7, 0, 5, 0},
                         {0, 0, 4, 9, 0, 5, 0, 0, 8},
                         {0, 8, 0, 0, 6, 0, 0, 9, 0},
                         {9, 0, 0, 4, 0, 3, 5, 0, 0},
                         {0, 5, 0, 7, 0, 0, 0, 0, 0},
                         {7, 0, 0, 0, 9, 0, 6, 0, 0},
                         {8, 0, 0, 0, 0, 6, 0, 2, 1}};
        
        new SudokuSolverUI(new SudokuBoardUI(board));
    }   
}
