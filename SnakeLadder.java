package snakeLadder;
import java.util.concurrent.ThreadLocalRandom;
public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("******** Welcome to Snake and Ladder Game *********");
		int player1_pos=0;
		System.out.println("Starting position of player1: "+player1_pos);
		int diceRoll=ThreadLocalRandom.current().nextInt(1,7);
		System.out.println("Number got after dice roll: "+diceRoll);
		int noPlay=0;
		int ladder=1;
		int luckRoll=ThreadLocalRandom.current().nextInt(-1,2);
		if(luckRoll==noPlay) {
			player1_pos+=0;
			System.out.println("Sorry its no play!");
		}
		else if(luckRoll==ladder) {
			player1_pos+=diceRoll;
			System.out.println("Bravo! Its a ladder");
		}
		else {
			player1_pos-=diceRoll;
			System.out.println("Ouch! You landed on a snake");
		}
		System.out.println("Player position after dice and luck roll: "+player1_pos);
	}

}
