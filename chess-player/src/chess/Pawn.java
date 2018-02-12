package chess;

public class Pawn implements Piece{

	
	public final int color;
	public Square position;
	public 
	
	
	public Pawn(){
		color = COLORLESS;
	}
	
	@Override
	public Square[] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Square getPos() {
		return this.position;
	}

	@Override
	public int getColor() {
		return this.color;
	}

	@Override
	public boolean move(Square dest) {
		// TODO Auto-generated method stub
		return false;
	}

}
