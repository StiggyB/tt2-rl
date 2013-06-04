package de.haw_hamburg.minf.game;

public class Board {

	private int[] boardState = {0,0,0,0,0,0,0,0,0};
	private final static int X = 1;
	private final static int O = 2;
	
	// Constructor
	public Board() {
	}
	
	// Methods
	
	// Getter & Setter
	public int[] getBoardState() {
		return boardState;
	}

	public void setBoardState(int[] boardState) {
		this.boardState = boardState;
	}
	
	/**
	 * @param pos from 1 to 9, where 1 is upper left corner and 9 lower right corner
	 */
	public void setCross(int pos) {
		try {
			if (boardState[pos-1] == 0)
				boardState[pos-1] = X;
			else
				System.err.println("Error, position already played.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error, non existing position entered. Board state not changed.");
		}
		showBoard();
	}
	
	/**
	 * @param pos from 1 to 9, where 1 is upper left corner and 9 lower right corner
	 */
	public void setCircle(int pos) {
		try {
			if (boardState[pos-1] == 0)
				boardState[pos-1] = O;
			else
				System.err.println("Error, position already played.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error, non existing position entered. Board state not changed.");
		}
		showBoard();
	}
	
	private void showBoard() {
		for (int i = 0; i < boardState.length; i++) {
			if (i == 2 || i == 5) {
				System.out.print("\n- - -\n");
			}
			boardPos(i);
			if (boardState[i] == 0) {
				System.out.print(" ");
			} else if (boardState[i] == 1) {
				System.out.print("X");
			} else if (boardState[i] == 2) {
				System.out.print("O");
			} else {
				
			}
			boardPos(i);
		}
	}
	
	private void boardPos(int pos) {
		if ((pos-1)%3 == 0) {
			System.out.print("|");
		}
	}

}
