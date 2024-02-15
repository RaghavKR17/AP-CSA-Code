//Raghav Krishna Ranganathan
//Peterson P5
//Critter Project

import java.util.Random;

public class Frog implements Critter {
	public int steps = 0;
	public int counts = NORTH;
	public char getChar() {
		return 'F';
	}
	public int getMove(CritterInfo info) {
		// checks if more than or equal to 2 steps
		if (steps >= 2) {
			steps = 0;
			// random direction like Bird
			Random rand = new Random(); 
			int num = rand.nextInt(5);
			if (num == 1) {
				counts = NORTH;
			}
			else if (num == 2) {
				counts = SOUTH;
			}
			else if (num == 3) {
				counts = WEST;
			}
			else if (num == 4) {
				counts = EAST;
			}
			return counts;
		}
		else { 
			steps ++ ;
			return counts;
		} 
	}
}
