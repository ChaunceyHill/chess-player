package chess;

public class Knight implements Piece{

	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	public Knight(){
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
			return "Nw";
		}
		else{
			return "Nb";
		}
	}
	
	public Knight(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}
}
