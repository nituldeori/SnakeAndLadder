package snakeLadder;
import java.util.concurrent.ThreadLocalRandom;
public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("******** Welcome to Snake and Ladder Game *********");
		int player1_pos=0;
		System.out.println("Starting position of player1: "+player1_pos);
		int diceRoll=ThreadLocalRandom.current().nextInt(1,7);
		System.out.println("Number got after dice roll: "+diceRoll);
	}

}
