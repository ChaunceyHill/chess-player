package chess;

public class Square {
	private final int x; private final int y;
	public Piece piece;
	
	public Square(int x, int y, Piece p){
		this.x = x; this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	public Piece getPiece(){
		return piece;
	}
	
}
