package chess;

import java.util.LinkedList;

public class Game {
	Board status;
	public LinkedList<Move> history;
	
	public Game(){
		history = new LinkedList<Move>();
		status = new Board();
	}
	
	public boolean done(){
		return true;
	}
	
	public void turn(){
		
	}
	
	public void play(){
		while(!done()){
			turn();
		}
	}
	
	public static void Main(String[] args){
		Game game = new Game();
		game.play();
	}
}
