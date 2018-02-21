package chess;

import java.util.HashSet;
import java.util.Set;

public class Pawn implements Piece{
	public final int color;
	public Square position;
	public int rank;
	public int file;
	//public 
	
	
	@Override
	public Set<Square> possibleMoves(Piece[][] board) {
		Set<Square> moves = new HashSet<Square>();	
		int dir = this.color == WHITE ? 1 : -1;
		int opp = this.color == WHITE ? BLACK : WHITE;
		
		
		if(rank == 3 && color == WHITE){
			if(board[4][file].getColor() == COLORLESS){
				if(board[5][file].getColor() == COLORLESS){
					moves.add(new Square(file, 5, this.file, this.rank));
				}
			}
		}
		if(rank == 8 && color == BLACK){
			if(board[7][file].getColor() == COLORLESS){
				if(board[6][file].getColor() == COLORLESS){
					moves.add(new Square(file, 6, this.file, this.rank));
				}
			}
		}
		//System.out.println(board.length + " " + board[0].length);
		//System.out.println(rank + " " + dir +  "  " + file);
		if(board[rank + dir][file].getColor() == COLORLESS){
		moves.add(new Square(file, rank+dir, this.file, this.rank));
		}
		if(board[rank + dir][file + 1].getColor() == opp){
			moves.add(new Square(file+1, rank+1, this.file, this.rank));
		}
		if(board[rank + dir][file - 1].getColor() == opp){
			moves.add(new Square(file-1, rank+1, this.file, this.rank));
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
			return "Pw";
		}
		else{
			return "Pb";
		}
	}
	
	@Override
	public void updatePos(int file, int rank){
		this.file = file;
		this.rank = rank;
	}
	
	public Pawn(int a, int b, int color){
		rank = a;
		file = b;
		this.color = color;
	}

}
