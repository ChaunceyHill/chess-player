package chess;

import java.util.HashSet;
import java.util.Set;

public class Blank implements Piece{

	/*
	 * This will be the filler piece that we put in all the empty squares
	 */
	int file;
	int rank;
	
	@Override
	public Set<Square> possibleMoves(Piece[][] board) {
		Set ans = new HashSet<int[]>();
		return ans;
	}

	@Override
	public Square getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return COLORLESS;
	}

	@Override
	public boolean move(Square dest) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String representation(){
		return "- ";
	}
	
	@Override
	public void updatePos(int file, int rank){
		this.file = file;
		this.rank = rank;
	}
	
	public Blank(int a, int b){
		file = b;
		rank = a;
	}

}
