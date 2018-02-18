package chess;

import java.util.Set;

public class Rook implements Piece{

	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	public Rook(){
		color = COLORLESS;
	}
	
	@Override
	public Set<int[]> possibleMoves() {
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
			return "Rw";
		}
		else{
			return "Rb";
		}
	}
	
	public Rook(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}
}
