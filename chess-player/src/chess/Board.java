package chess;

public class Board {
	
	public static final int BLACK = 1;
	public static final int WHITE = 0;
	public static final int HEIGHT = 8;
	public static final int WIDTH = 8;
	
	private Piece[][] pieces;
	private boolean[] canCastle = {true, true};
	
	/*
	 * This will be the method that updates the board on the graphical user interface
	 * every time a move is made
	 */
	public void draw(){
		
	}
	
	/*
	 * This is the constructor for a board, it will make a board that has the starting 
	 * position of chess
	 */
	public Board(){
		pieces = new Piece[8][8];
		for(int i = 2; i <= HEIGHT -2; ++i){
			for(int j = 0; j < WIDTH; ++j){
				
			}
		}
	}
}
