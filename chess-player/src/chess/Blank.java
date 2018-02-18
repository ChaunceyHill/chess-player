package chess;

import java.util.Set;

public class Blank implements Piece{

	/*
	 * This will be the filler piece that we put in all the empty squares
	 */
	int file;
	int rank;
	
	@Override
	public Set<int[]> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Square getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return 0;
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
	
	public Blank(int a, int b){
		file = b;
		rank = a;
	}

}
