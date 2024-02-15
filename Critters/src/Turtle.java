//Raghav Krishna Ranganathan
//Peterson P5
//Critter Project

//Turtle moves in a circle. Object T.
public class Turtle implements Critter {
	public char getChar() {
		return 'T';
	}
	private int count = 20;
    public int getMove(CritterInfo info) {
    	if (count == 0) {
    		count = 20;
    	}
    	
    	if (15 < count && count <= 20) {
    		count -=1 ;
    		return Critter.SOUTH;
    	}
    	
    	if (10 < count && count <= 15) {
    		count -=1;
    		return Critter.WEST;
    	}
    	
    	if (5 < count && count <= 10) {
    		count -=1;
    		return Critter.NORTH; 		
    	}
    	
    	
    	if (0 < count && count <=5) {
    		count -=1;
    		return Critter.EAST;
    	}
    	
    	return Critter.EAST;
    	
    } 
}
