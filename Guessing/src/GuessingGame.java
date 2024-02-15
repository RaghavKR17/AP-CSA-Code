// Raghav Krishna Ranganathan
// APCS Period 5
// Guessing Game Programming Assignment
// 11/29/21

//runs guessing game program
import java.util.*;
public class GuessingGame {
	public static final int max = 100, min = 1;
	public static void main(String[] args) {
		//creates loop which calls function that contains game
		// also asking if user will play again
		// also displays final info.
		boolean restart = true;		
		int numofguess = 0;
		int numofgame = 0;
		int highscore = 0;
		Scanner cnsl = new Scanner(System.in);
		while(restart) {
			numofgame++;			
			numofguess += gameplay(cnsl);
			if(highscore > numofguess || highscore == 0) {
				highscore = numofguess;
			}
			System.out.println("Play again?");
			char checkrestart = cnsl.next().charAt(0);
			if(checkrestart != 'y' && checkrestart != 'Y') {
				restart = false;
			}			
		}
		System.out.println("Your overall results:");
		System.out.println("Total games = " + numofgame);
		System.out.println("Total guesses = " + numofguess);
		System.out.println("Guesses/game = " + (double) numofguess/numofgame);
		System.out.println("Best game = " + highscore);
	}

	public static int numgen() {
		//numgen generates random integer between min and max
		Random r = new Random();
		int numtarg = r.nextInt(max) + min;
		return numtarg;
	}
	
	public static int gameplay(Scanner cnsl) {
		//gameplay plays guessing game with user.
		int numtarg = numgen();
		int currnumofguess = 0;
		int guess = 0;
		System.out.println("I'm thinking of a number between 1 and 100...");
		boolean guessed = false;
		while(!guessed) {
			System.out.println("Your guess?");
			if(cnsl.hasNextInt()) {
				currnumofguess++;
				guess = cnsl.nextInt();
				if(guess < 1 || guess > 100) {
					System.out.println("Your guess was not a whole number between 1 and 100");
					currnumofguess--;
				}
				else if(guess == numtarg) {
					System.out.println("You guessed it in " + currnumofguess + " guesses!");
					guessed = true;
				} 
				else if(guess < numtarg) {
					System.out.println("It's higher.");
				}												
				else  {
					System.out.println("It's lower.");
				}
			}
			else {
				System.out.println("Your guess was not a whole number between 1 and 100");
			}				
		}
		return currnumofguess;
	}
}