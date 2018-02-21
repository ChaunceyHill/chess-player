package chess;

import java.util.HashSet;
import java.util.Set;

public class Board {
	
	public static final int BLACK = 1;
	public static final int WHITE = 0;
	public static final int COLORLESS = -1;
	public static final int HEIGHT = 8;
	public static final int WIDTH = 8;
	
	private Piece[][] pieces;
	private boolean[] canCastle = {true, true};
	/**
	 * convert a coordinate pair to account for padding
	 * @param cords
	 * @return
	 */
	public int[] convert(int[] cords){
		int[] ans = new int[2];
		ans[0] = cords[0] + 2;
		ans[1] = cords[1] + 2;
		return ans;
	}
	
	/*
	 * This will be the method that updates the board on the graphical user interface
	 * every time a move is made
	 */
	public void draw(){
		for(int i = HEIGHT+1; i >= 2; --i){
			System.out.print(i - 1 + " ");
			for (int j = 2; j < WIDTH + 2; ++j){
				System.out.print(pieces[i][j].representation() + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("  A  B  C  D  E  F  G  H");
	}
	
	public Set<Square> getAllMoves(){
		Set<Square> moves = new HashSet<Square>();
		for(int i = 0; i < pieces.length; ++i){
			for(int j = 0; j < pieces.length; ++j){
				//System.out.println(pieces[i][j].representation() + " " + i + " " + j);
				moves.addAll(pieces[i][j].possibleMoves(pieces));
			}
		}
		return moves;
	}
	
	public boolean apply(Square move){
		
		Piece start = pieces[move.getYStart()][move.getXStart()];
		if(start.getColor() == COLORLESS){
			return false;
		}
					
		pieces[move.getYEnd()][move.getXEnd()] = start;
		pieces[move.getYStart()][move.getXStart()] = new Blank(move.getYStart(),move.getXStart());
		
		pieces[move.getYEnd()][move.getXEnd()].updatePos(move.getXEnd(), move.getYEnd());

		System.out.println();
		
		return false;
	}
	
	public int getColor(int rank, int file){
		 return pieces[rank][file].getColor();
	}
	
	public boolean isValid(String s){
		if(s.length()>=4){
			char[] chars = s.toCharArray();
			int x1 = chars[0] - 'a';
			int y1 = chars[1] - '1';
			int x2 = chars[2] - 'a';
			int y2 = chars[3] - '1';
			//System.out.println("(" + x1 + ", " + y1 + "),(" + x2 + ", " + y2 + ")");
			return true;
		}	
		return false;
	}
	
	/*
	 * This is the constructor for a board, it will make a board that has the starting 
	 * state of chess
	 */
	public Board(){
		pieces = new Piece[HEIGHT + 4][WIDTH + 4];//padding for easy move checking
		for(int i = 0; i < HEIGHT + 4; ++i){
			for(int j = 0; j < WIDTH + 4; ++j){
				pieces[i][j] = new Blank(i,j);
			}
		}
		for(int i = 2; i < WIDTH + 2; ++i){
			pieces[3][i] = new Pawn(3,i, WHITE);
			pieces[8][i] = new Pawn(8,i, BLACK);	
		}
		Piece[] whites = {new Blank(2,11), new Blank(2,10),new Rook(2,9, WHITE),new Knight(2,8, WHITE),
				new Bishop(2,7, WHITE),new Queen(2,6, WHITE), new King(2,5, WHITE),new Bishop(2,4, WHITE),
				new Knight(2,3, WHITE),new Rook(2,2, WHITE), new Blank(2,1), new Blank(2,0)};
		Piece[] blacks = {new Blank(9,11), new Blank(9,10),new Rook(9,9, BLACK),new Knight(9,8, BLACK),
				new Bishop(9,7, BLACK),new Queen(9,6, BLACK),new King(9,5, BLACK),new Bishop(9,4, BLACK)
				,new Knight(9,3, BLACK),new Rook(9,2, BLACK), new Blank(9,1), new Blank(9,0)};
		pieces[2] = whites;
		pieces[9] = blacks;
		
		
	}
	
}
