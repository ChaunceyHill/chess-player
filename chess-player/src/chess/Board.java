package chess;

import java.util.Set;

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
		for(int i = HEIGHT-1; i >= 0; --i){
			System.out.print(i + 1 + " ");
			for (int j = 0; j < WIDTH; ++j){
				System.out.print(pieces[i][j].representation() + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("  A  B  C  D  E  F  G  H");
	}
	
	public boolean apply(String s){
		char[] chars = s.toCharArray();
		int x1 = chars[0] - 'a';
		int y1 = chars[1] - '1';
		int x2 = chars[2] - 'a';
		int y2 = chars[3] - '1';
		Piece start = pieces[y1][x1];
		Set<int[]> moves = start.possibleMoves();
		
		pieces[y2][x2] = start;
		pieces[y1][x1] = new Blank(y1,x1);
		
		return false;
	}
	
	public boolean isValid(String s){
		if(s.length()>=4){
			char[] chars = s.toCharArray();
			int x1 = chars[0] - 'a';
			int y1 = chars[1] - '1';
			int x2 = chars[2] - 'a';
			int y2 = chars[3] - '1';
			System.out.println("(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")");
			return true;
		}	
		return false;
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
		Piece[] whites = {new Rook(0,7, WHITE),new Knight(0,6, WHITE),new Bishop(0,5, WHITE),new Queen(0,4, WHITE),
				new King(0,3, WHITE),new Bishop(0,2, WHITE),new Knight(0,1, WHITE),new Rook(0,0, WHITE)};
		Piece[] blacks = {new Rook(7,7, BLACK),new Knight(7,6, BLACK),new Bishop(7,5, BLACK),new Queen(7,4, BLACK),
				new King(7,3, BLACK),new Bishop(7,2, BLACK),new Knight(7,1, BLACK),new Rook(7,0, BLACK)};
		pieces[0] = whites;
		pieces[7] = blacks;
		
		
	}
	
}
