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
		
		System.out.println("  A  B  C  D  E  F  G  H");
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
			pieces[1][i] = new Pawn(0,i, WHITE);
			pieces[6][i] = new Pawn(0,i, BLACK);	
		}
		Piece[] whites = {new Rook(0,7, WHITE),new Knight(0,6, WHITE),new Bishop(0,5, WHITE),new King(0,4, WHITE),
				new Queen(0,4, WHITE),new Bishop(0,2, WHITE),new Knight(0,1, WHITE),new Rook(0,0, WHITE)};
		Piece[] blacks = {new Rook(7,7, BLACK),new Knight(7,6, BLACK),new Bishop(7,5, BLACK),new King(7,4, BLACK),
				new Queen(7,4, BLACK),new Bishop(7,2, BLACK),new Knight(7,1, BLACK),new Rook(7,0, BLACK)};
		pieces[0] = whites;
		pieces[7] = blacks;
		
		
	}
	public static void main (String[] args){
		Board myBoard = new Board();
		myBoard.draw();
	}
}
