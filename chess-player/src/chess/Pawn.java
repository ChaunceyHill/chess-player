package chess;

import java.util.HashSet;
import java.util.Set;

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
	public Set<int[]> possibleMoves() {
		// TODO Auto-generated method stub
		Set<int[]> moves = new HashSet<int[]>();
		
		
		return moves;
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
