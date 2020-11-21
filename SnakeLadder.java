package snakeLadder;
import java.util.concurrent.ThreadLocalRandom;
public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("******** Welcome to Snake and Ladder Game *********");
		int player1_pos=0;
		int player2_pos=0;
		int toss=ThreadLocalRandom.current().nextInt(1,3);
		System.out.println("Starting position of player1: "+player1_pos);
		System.out.println("Starting position of player2: "+player2_pos);
		while(player1_pos!=100 && player2_pos!=100) {
		    int diceRoll=ThreadLocalRandom.current().nextInt(1,7);
		    int noPlay=0;
		    int ladder=1;
		    int luckRoll=ThreadLocalRandom.current().nextInt(-1,2);
		    if(luckRoll==noPlay) {
		    	if(toss==1) {
			        player1_pos+=0;
		    	    toss=2;
		    	}
		    	else
		    		player2_pos+=0;
		    	    toss=1;
		    }
		    else if(luckRoll==ladder) {
		    	if(toss==1) {
		    		if(player1_pos+diceRoll<=100) {
		    			player1_pos=player1_pos+diceRoll;
		    		}
		    			
		    	}
		    	else {
		    		if(player2_pos+diceRoll<=100) {
		    			player2_pos=player2_pos+diceRoll;
		    		}
		    	}
		    }
		    else {
		    	if(toss==1) {
		    		if(player1_pos-diceRoll<0) {
		    			player1_pos=0;
		    		}
		    		else
		    			player1_pos-=diceRoll;
		    		toss=2;
		    	}
		    	else {
		    		if(player2_pos-diceRoll<0) {
		    			player2_pos=0;
		    		}
		    		else
		    			player2_pos-=diceRoll;
		    		toss=1;
		    	}
			    
			        
			}
		        System.out.println("Position of player1 after die roll: "+player1_pos);
		        System.out.println("Position of player2 after die roll: "+player2_pos);
		    }
		    
		
		if(player1_pos==100) {
			System.out.println("Player 1 won");
		}
		else
			System.out.println("Player 2 won");
	}

}
