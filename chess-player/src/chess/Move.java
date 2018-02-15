package chess;

public class Move {

	public static final boolean COLOUR_WHITE = true;
	public static final boolean COLOUR_BLACK = false;
	
	boolean taking;
	Piece piece;
	Square start;
	Square end;
	boolean col;
	//will implement a way to track castling later on
	
	
	public Move(Piece piece, Square start, Square end, boolean taking){
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
