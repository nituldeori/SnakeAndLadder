package snakeLadder;
import java.util.concurrent.ThreadLocalRandom;
public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("******** Welcome to Snake and Ladder Game *********");
		int player1_pos=0;
		System.out.println("Starting position of player1: "+player1_pos);
		while(player1_pos!=100) {
		    int diceRoll=ThreadLocalRandom.current().nextInt(1,7);
		    int noPlay=0;
		    int ladder=1;
		    int luckRoll=ThreadLocalRandom.current().nextInt(-1,2);
		    if(luckRoll==noPlay) {
			    player1_pos+=0;
		    }
		    else if(luckRoll==ladder) {
			    player1_pos+=diceRoll;
		    }
		    else {
			    if(player1_pos-diceRoll<0) {
				    player1_pos=0;
			    }
			else
			    player1_pos-=diceRoll;
		    }
		
	    }
		System.out.println("Congratulations! You reached the 100 position and won");
	}

}
