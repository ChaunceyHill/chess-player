package chess;

public class Board {
	
	public static final int BLACK = 1;
	public static final int WHITE = 0;
	public static final int HEIGHT = 8;
	public static final int WIDTH = 8;
	
	Piece[][] pieces;
	
	
	public void draw(){
		
	}
	
	public Board(){
		pieces = new Piece[8][8];
		for(int i = 2; i <= HEIGHT -2; ++i){
			for(int j = 0; j < WIDTH; ++j){
				
			}
		}
	}
}
