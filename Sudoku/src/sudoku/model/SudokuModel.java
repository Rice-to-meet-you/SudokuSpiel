package sudoku.model;

public class SudokuModel {
	public int[][] model;
	
	public SudokuModel() {
		model = new int [9][9];
	}
	
	public int getValue(int row, int col) {
		return model[row][col];
	}
	
	
}
	
