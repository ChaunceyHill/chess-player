package chess;

import java.util.HashSet;
import java.util.Set;

public class King implements Piece{

	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	public King(){
		color = COLORLESS;
	}
	
	@Override
	public Set<Square> possibleMoves(Piece[][] board) {
		Set<Square> moves = new HashSet<Square>();	
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
			return "Kw";
		}
		else{
			return "Kb";
		}
	}
	
	public King(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}
	
	@Override
	public void updatePos(int file, int rank){
		this.file = file;
		this.rank = rank;
	}
}
