package chess;

public class Move {

	public static final boolean COLOUR_WHITE = true;
	public static final boolean COLOUR_BLACK = false;
	//public static final cha
	
	
	Piece piece;
	Square start;
	Square end;
	boolean col;
	boolean capture;
	//will implement a way to track castling later on
	
	
	public Move(Piece piece, Square start, Square end, boolean capture){
		//constructor
		//need to copy construct all of these will implement those constructors then this
	}
	
	public Move(String s){
		//construct a move from a string
	}
	
	/**
	 * Check if a move can be applied to a board legally
	 * Board b: the board to apply move to
	 * boolean col: if the piece being moved is white or black
	 *
	 */
	public boolean isValid(Board b, boolean col){
		return true;
		
		
	}
	
	@Override
	public String toString(){
		//string representaiton 
		return "";
	}
}
