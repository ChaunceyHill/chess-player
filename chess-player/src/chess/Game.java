package chess;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Game {
	Board status;
	public LinkedList<Move> history;
	Scanner sc;

	public Game(){
		history = new LinkedList<Move>();
		status = new Board();
		sc = new Scanner(System.in);
	}

	public boolean done(){
		return true;
	}

	public String getInput(){
		String ans = sc.nextLine();
		System.out.println(ans);

		return ans;
	}

	public void turn(){
		Set<Square> moves = status.getAllMoves();
		for(Square a: moves){
			System.out.println(a.getX() + " " + a.getY() + " " + a.getPiece().representation());
		}
		String move = getInput();
		if(this.status.isValid(move)){
			System.out.println(this.status.apply(move));
		}
	}

	public void play(){

		while(true){
			this.status.draw();
			turn();

		}
	}

	public static void main(String[] args){
		Game game = new Game();
		System.out.println("move will for now be denoted <source> <destination> e.g. e2e4");
		game.play();
	}

}
