package sudoku.constants.gameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDRY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    Public GameState gameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilies.copyToNewArray(gridState);
    }
}