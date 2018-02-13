package chess;

import java.util.LinkedList;

public class Game {
	Board status;
	public LinkedList<Move> history;
	
	public Game(){
		history = new LinkedList<Move>();
		status = new Board();
	}
	
	public static void Main(String[] args){
		
	}
}
