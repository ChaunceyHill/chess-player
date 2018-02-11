package chess;

public interface Piece {
	
	public static final int BLACK = 1;
	public static final int WHITE = 0;
	public static final int COLORLESS = -1;
	public static final int HEIGHT = 8;
	public static final int WIDTH = 8;
	
	final int color = COLORLESS;
	
	public Square[] possibleMoves();
	
	
}
