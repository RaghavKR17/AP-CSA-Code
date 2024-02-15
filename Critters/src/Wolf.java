//Raghav Krishna Ranganathan
//Peterson P5
//Critter Project

public class Wolf implements Critter {
	public char getChar() {
		return 'W';
	}
	//Chasing Program
	public int getMove(CritterInfo info) { 
		if (!(info.getNeighbor(NORTH) == '.')) {
			return NORTH;
		}
		if (!(info.getNeighbor(EAST) == '.')) {
			return EAST;
		}
		if (!(info.getNeighbor(SOUTH) == '.')) {
			return SOUTH;
		}
		if (!(info.getNeighbor(WEST) == '.')) {
			return WEST;
		}
		//Lone Wolf
		if (info.getNeighbor(WEST)=='W') { 
			return EAST;
		} else if (info.getNeighbor(NORTH)=='W') {
			return SOUTH;
		}else if (info.getNeighbor(SOUTH)=='W') {
			return NORTH;
		}else if (info.getNeighbor(EAST)=='W') {
			return WEST;
		}
		//Random Movement
		double num = Math.random() * 4; 
		if (num <= 1) { return NORTH; }
		if (num <= 2) { return EAST; }
		if (num <= 3) { return SOUTH; }
		if (num <= 4) { return WEST; }
		return NORTH;
	}
	
}
