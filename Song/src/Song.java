// Raghav Krishna Ranganathan, APCS Peterson P5
// Song Programming Project Chapter #1, 09/14/21
//
// This program's behavior is designed to print out the following verse ...
/*
Bought me a cat and the cat pleased me,
I fed my cat under yonder tree.
Cat goes fiddle-i-fee.

Bought me a hen and the hen pleased me,
I fed my hen under yonder tree.
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a duck and the duck pleased me,
I fed my duck under yonder tree.
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a goose and the goose pleased me,
I fed my goose under yonder tree.
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a sheep and the sheep pleased me,
I fed my sheep under yonder tree.
Sheep goes baa, baa,
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a pig and the pig pleased me,
I fed my pig under yonder tree.
Pig goes oink, oink,
Sheep goes baa, baa,
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.
*/

public class Song {

	public static void main(String[] args) {
		cat(); // calls the cat method
		fiddle(); // calls the fiddle method
		blank(); // calls the blank method
		hen(); // calls the hen method
		chuck(); // calls the chuck method
		fiddle(); 
		blank();
		duck(); // calls the duck method
		quack(); // calls the quack method
		chuck();
		fiddle();
		blank();
		goose(); // calls goose method
		hissy(); // calls hissy method
		quack(); 
		chuck();
		fiddle();
		blank();
		sheep(); // calls sheep method
		baa(); // calls baa method
		hissy(); 
		quack();
		chuck();
		fiddle();
		blank();
		pig(); // calls pig method
		oink(); // calls oink method
		baa();
		hissy();
		quack();
		chuck();
		fiddle();
		
		
	}
	public static void cat() {
		System.out.println("Bought me a cat and the cat pleased me,"); // prints given line
		System.out.println("I fed my cat under yonder tree."); // prints given line
	}
	public static void hen() {
		System.out.println("Bought me a hen and the hen pleased me,"); // prints given line.
		System.out.println("I fed my hen under yonder tree."); // prints given line
	}
	public static void duck() {
		System.out.println("Bought me a duck and the duck pleased me,"); // prints given line
		System.out.println("I fed my duck under yonder tree."); // prints given line
	}
	public static void goose() {
		System.out.println("Bought me a goose and the goose pleased me,"); // prints given line
		System.out.println("I fed my goose under yonder tree."); // prints given line
	}
	public static void sheep() {
		System.out.println("Bought me a sheep and the sheep pleased me,"); // prints given line
		System.out.println("I fed my sheep under yonder tree."); // prints given line
	}
	public static void pig() {
		System.out.println("Bought me a pig and the pig pleased me,"); // prints given line
		System.out.println("I fed my pig under yonder tree."); // prints given line
	}	
	public static void oink() {
		System.out.println("Pig goes oink, oink,"); // prints given line
	}
	public static void baa() {
		System.out.println("Sheep goes baa, baa,"); // prints given line
	}
	public static void hissy() {
		System.out.println("Goose goes hissy, hissy,"); // prints given line
	}
	public static void quack() {
		System.out.println("Duck goes quack, quack,"); // prints given line
	}
	public static void chuck() {
		System.out.println("Hen goes chimmy-chuck, chimmy-chuck,"); // prints given line
	}
	public static void fiddle() {
		System.out.println("Cat goes fiddle-i-fee."); // prints given line
	}
	public static void blank() {
		System.out.println(""); // prints blank line
	}
}
