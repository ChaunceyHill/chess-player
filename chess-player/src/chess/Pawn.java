package chess;

public class Pawn implements Piece{

	
	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	public Pawn(){
		color = COLORLESS;
	}
	
	@Override
	public Move[] possibleMoves() {
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
	
	@Override
	public String representation(){
		if(color == WHITE){
			return "Pw";
		}
		else{
			return "Pb";
		}
	}
	
	public Pawn(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}

}
