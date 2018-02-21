package chess;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Game {
	Board status;
	public LinkedList<Move> history;
	Scanner sc;
	int turn;

	public Game(){
		history = new LinkedList<Move>();
		status = new Board();
		sc = new Scanner(System.in);
		turn = 0;
	}

	public boolean done(){
		return true;
	}

	public String getInput(){
		String ans = sc.nextLine();
		//System.out.println(ans);

		return ans;
	}

	public void turn(){
		
		
		Set<Square> moves = status.getAllMoves();
		Square move = new Square(getInput());
		System.out.println(move.toString());
		if(moves.contains(move)){
			if(turn % 2 == status.getColor(move.getYStart(), move.getXStart())){
				status.apply(move);
				++turn;
			}
			else{
				System.out.println("That's not your piecee");
			}
		}
		else{

			System.out.println("not a legal move");
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
