//Raghav K.Ranganathan November 8th 2021 P5

//imports scanner module
import java.util.*;

//program that gets current date and 2 birthdays. prints out info. (assumes that it is 2021)
public class Birthdays {
	public static void main(String args[]) {
		// new scanner
		Scanner scan = new Scanner(System.in);
		
		//variable
		int monthandday = ask(scan, "Please enter today's date (month day):");
		
		//each birthday info
		int b1 = calculate(scan, "Please enter person #1's birthday (month day):", monthandday);
		int b2 = calculate(scan, "Please enter person #2's birthday (month day):", monthandday);
		
		//print info
		printinfo(monthandday, b1, b2);
	}
	
	//asks about today and returns day in year
	public static int ask(Scanner scan, String prompt) {
		
		//prompt
		System.out.println(prompt);
		
		//gets month and day
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		//day of the year
		int monthandday = dayInYear(month, day);
		
		//month, day, and day of the year
		System.out.println("Today is " + month + "/" + day + "/2021, day #" + monthandday + " of the year.");
		
		//day of the year
		return monthandday;
	}
	
	//asks about a person's birthday, prints info with days until birthday.
	public static int calculate(Scanner scan, String prompt, int monthandday) {
		
		//prompt
		System.out.println();
		System.out.println(prompt);
		
		//gets birthday month,day, and day in year
		int bmonth = scan.nextInt();
		int bday = scan.nextInt();
		int bmonthandday = dayInYear(bmonth, bday);
		
		//prints info
		System.out.print(bmonth + "/" + bday + "/2021 falls on day #" + bmonthandday + " of 365. " );
		
		//number of days until birthday
		int daystobday = (bmonthandday - monthandday + 365)%365;
		
		//if birthday is today
		if(daystobday == 0) {
			System.out.println("OMG.... Happy Birthday!!!");
		}
		//if birthday is not today
		else {
			System.out.println("Your next birthday is in " + daystobday + " day(s).");
		}
		
		//days until birthday
		return daystobday;
	}
	
	//day in year
	public static int dayInYear(int month, int day) {
		int total = 0;
		
		//sum
		for(int i = 1; i < month; i++) {
			total += daysInMonth(i);
		}
		
		return total + day;
	}
	
	//number of days in year
	public static int daysInMonth(int month) {
		
		//april, june, september, november
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		
		//non-february
		else if(month != 2) {
			return 31;
		}
		
		//february
		return 28;
	}
	
	//prints info
	public static void printinfo(int monthandday, int b1, int b2) {
		
		System.out.println();
		
		//prints which birthday is sooner
		if(b1 == b2) {
			System.out.println("Person #1 and Person #2 have the same birthday.");
		}
		else if (b1 < b2) {
			System.out.println("Person #1's birthday is sooner.");
		}
		else {
			System.out.println("Person #2's birthday is sooner.");
		}
		
		//fun fact
		if(monthandday != 207) {
			System.out.println();
			System.out.println("July 26th is this program's creator's  birthday!");
		}
	}
}