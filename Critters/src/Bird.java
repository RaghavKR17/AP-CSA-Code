//Raghav Krishna Ranganathan
//Peterson P5
//Critter Project

import java.util.*;
// This class implements Critter. 
public class Bird implements Critter {
	// initializes array directions with directions for values
	private int[] directions = {NORTH, EAST, SOUTH, WEST};
	//get char method
	public char getChar() {
		return 'B';
	}
	// gets the calculated move
	public int getMove(CritterInfo info) {
		// Random Direction
		Random rand = new Random();
		int num = rand.nextInt(4);
		
		return directions[num];
	}
}

