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
		for(int i = 0; i < HEIGHT; ++i){
			System.out.print(i + 1 + " ");
			for (int j = 0; j < WIDTH; ++j){
				System.out.print(pieces[i][j].representation() + " ");
			}
			System.out.println();
		}
		
		System.out.println("  A B C D E F G H");
	}
	
	/*
	 * This is the constructor for a board, it will make a board that has the starting 
	 * state of chess
	 */
	public Board(){
		pieces = new Piece[HEIGHT][WIDTH];
		for(int i = 0; i < HEIGHT; ++i){
			for(int j = 0; j < WIDTH; ++j){
				pieces[i][j] = new Blank(i,j);
			}
		}
		for(int i = 0; i < WIDTH; ++i){
			pieces[0][i] = new Pawn(0,i, WHITE);
			pieces[1][i] = new Pawn(0,i, WHITE);
			pieces[6][i] = new Pawn(0,i, BLACK);
			pieces[7][i] = new Pawn(0,i, BLACK);
		}
		
	}
	public static void main (String[] args){
		Board myBoard = new Board();
		myBoard.draw();
	}
}
