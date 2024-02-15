//Raghav Krishna Ranganathan
//Peterson P5
//Critter Project

// Just like Turtle but can be still or slowly move
public class OldTurtle extends Turtle implements Critter {
	private int n = 1; // initializes whether the OldTurtle is still or not
	
	public char getChar() {
		return 'O';
	}
	
	public int getMove(CritterInfo info) {
		if (n > 0) {
			n *= -1;
			return super.getMove(info);
		} else {
			n *= -1;
			return CENTER;
		}
	}
}
