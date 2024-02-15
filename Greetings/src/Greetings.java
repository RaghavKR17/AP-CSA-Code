//Raghav Krishna Ranganathan, AP Comp Sci P5 Peterson
//Programming Project 3A, 10/15/2021

//this program gets inputs of info from a user and prints a greeting

import java.util.Scanner;
import java.util.Calendar;

//main method - assigns scanner to variable input and calls greet method with input as parameter
public class Greetings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(greet(input));
	}
	
	//greet method - reads input variable with scanner and prints corresponding greeting
	public static String greet(Scanner readInput) {
		System.out.println("Please enter your first name:");
		String firstName = readInput.next();
		System.out.println("Please enter your last name:");
		String lastName = readInput.next();
		System.out.println("Please enter your year of birth:");
		int birthYear = readInput.nextInt();
		int currentYear = (Calendar.getInstance().get(Calendar.YEAR));
		int age = currentYear - birthYear;
		String finalGreet = "Greetings, " + firstName.toUpperCase().charAt(0) + ". " + lastName.toUpperCase().charAt(0) + lastName.substring(1) + "! You are about " + age + " years old.";
		return finalGreet;
	}
}
