//Raghav Krishna Ranganathan
// APCS P5
//Chap 6 Baby Names

//program that takes user input, get's info from file, and gives back respective info.
import java.util.*;
import java.io.*;
public class BabyNames {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("** Popularity of a baby name since year 1900 **");
		Scanner input = new Scanner(new File("names.txt"));
		Scanner console = new Scanner (System.in);
		//asks to continue (fencepost)
		name(input, console, false); 
		System.out.println("Would you like to search another name? ");
		String ans = console.next();
		while (ans.charAt(0) == 'y' || ans.charAt(0) == 'Y') {
			name(input, console, false);
			System.out.println("Would you like to search another name? ");
			ans = console.next();
		}
	}
	
	
	public static void name(Scanner input, Scanner x, boolean has_found) throws FileNotFoundException {
		//input takes in name.txt, x takes input from user, boolean keeps track of whether name is found 
		//output method
		System.out.println();
		System.out.println("name?");
		int yr = 1900; 
		String name = x.next();
		while(input.hasNextLine()&&has_found==false) {
		//scans whole names.txt file
			String currentline = input.nextLine();
			Scanner lineScan = new Scanner (currentline); 
			String curname = lineScan.next();
			if (name.equalsIgnoreCase(curname)) {
			//checks if name matching 
				PrintStream out = new PrintStream(new File(name+".txt"));
				while (lineScan.hasNextInt()){
					int next_Int = lineScan.nextInt(); 
					System.out.println(yr + ": " + next_Int); //prints output
					out.println(yr + ": " + next_Int); //prints to file 
					yr += 10; 
				}
				
				has_found = true; 
			}
			
		}
		if (has_found == false) {
			System.out.println("name not found.");
			//prints name not found (no file created)
		}
		
		
		System.out.println("");
	}
	
	
}
