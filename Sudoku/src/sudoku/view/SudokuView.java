package sudoku.view;

import javax.swing.JFrame;

public class SudokuView extends JFrame {
	
	public SudokuView() {
		setTitle("Sudoku Spiel"); // Titel
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Schließen bei X
		setLocationRelativeTo(null); // zentrieren des Fensters (mittig)
		setSize(800, 600);
		
		setVisible(true); // Sichtbarmachen des Fensters
	}

}
