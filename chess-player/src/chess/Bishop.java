package chess;

import java.util.HashSet;
import java.util.Set;

public class Bishop implements Piece {

	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	public Bishop(){
		color = COLORLESS;
	}
	public Bishop(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}
	
	@Override
	public Set<Square> possibleMoves(Piece[][] board) {
		Set<Square> moves = new HashSet<Square>();	
		for(int i = 0; i < 8; ++i) {
			if (board[rank +i][file+i].getColor() == COLORLESS) {
				moves.add(new Square(file + i, rank + i, file, rank));
			}
			else {
				if(board[rank +i][file +i].getColor() + color == 1) {
					moves.add(new Square(file + i, rank + i, file, rank));
				}
				break;
			}
		}
		for(int i = 0; i < 8; ++i) {
			if (board[rank -i][file+i].getColor() == COLORLESS) {
				moves.add(new Square(file + i, rank - i, file, rank));
			}
			else {
				if(board[rank -i][file +i].getColor() + color == 1) {
					moves.add(new Square(file + i, rank - i, file, rank));
				}
				break;
			}
		}
		for(int i = 0; i < 8; ++i) {
			if (board[rank -i][file-i].getColor() == COLORLESS) {
				moves.add(new Square(file - i, rank - i, file, rank));
			}
			else {
				if(board[rank -i][file -i].getColor() + color == 1) {
					moves.add(new Square(file - i, rank - i, file, rank));
				}
				break;
			}
		}
		for(int i = 0; i < 8; ++i) {
			if (board[rank +i][file-i].getColor() == COLORLESS) {
				moves.add(new Square(file - i, rank + i, file, rank));
			}
			else {
				if(board[rank +i][file -i].getColor() + color == 1) {
					moves.add(new Square(file - i, rank + i, file, rank));
				}
				break;
			}
		}
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
			return "Bw";
		}
		else{
			return "Bb";
		}
	}
	
	@Override
	public void updatePos(int file, int rank){
		this.file = file;
		this.rank = rank;
	}
	
	
}
