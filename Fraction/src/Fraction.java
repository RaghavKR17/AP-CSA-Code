// Raghav K.Ranganathan, APCS P5	
// Fraction Programming Project
// 1/30/2022

// uses methods to encapsulate behavior and state of improper fraction. (+, - , *, /)

import java.util.Scanner;
public class Fraction {
	//Private variables
	private int numerator;
	private int denominator;
	
		//constructor that takes parameters n & d and checks if d is 0
		public Fraction(int n, int d) throws IllegalArgumentException {
	
		if (d == 0) {
		throw new IllegalArgumentException("denominator cannot be 0");
		}
	
		numerator = n;
		denominator = d;
		reduceFraction();
		}
	
		//constructor that makes whole number fraction
		public Fraction(int wholeNumber) {
	
		numerator = wholeNumber;
		denominator = 1;
		}
	
		//constructor that accepts 1 string parameter and makes fraction string
		public Fraction(String improperFraction) {
			boolean negative = false;
			if (improperFraction.charAt(0) == '-' ||improperFraction.charAt(0) == '+') {
				if (improperFraction.charAt(0) == '-') {
				negative = true;
			}
				improperFraction = improperFraction.substring(1);
			}
		
			String strFraction = "";
			for (int i = 0; i < improperFraction.length(); i++) {
				if (improperFraction.charAt(i) == '/') {
				strFraction += " ";
				} else {
					strFraction += improperFraction.charAt(i);
					}
			    }
		
			Scanner console = new Scanner(strFraction);
			numerator = console.nextInt();
				if (negative) {
				numerator *= -1;
				}
				denominator = console.nextInt();
		
			reduceFraction();
		
		}
	
		//simplifies or reduces fraction
		private void reduceFraction() {
			if ((numerator < 0 && denominator < 0) ||(denominator < 0 && numerator > 0)) {
				numerator *= -1;
				denominator *= -1;
				}
			for (int i = Math.min(Math.abs(numerator), Math.abs(denominator)); i >= 2; i--) {
				if (numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}
	}
	
		//take numerator and return
		public int getNumerator() {
			return numerator;
		}
	
		//same as getNumerator but for denominator
		public int getDenominator() {
			return denominator;
		}
	
		// add parameter and return simplified
		public Fraction add(Fraction f) {
			int n = 0;
			int d = 0;
	
		n = numerator * f.getDenominator() + f.getNumerator() * denominator;
		d = denominator * f.getDenominator();
		for (int i = Math.min(Math.abs(n), Math.abs(d)); i >= 2; i--) {
			if (n % i == 0 && d % i == 0) {
			n /= i;
			d /= i;
		}
	}
	
		if (n == 0) {
			d = 1;
	}
		return new Fraction (n, d);
	}
		//same as add method but subtracts
		public Fraction subtract(Fraction f) {
			int n = 0;
			int d = 0;
	
		n = numerator * f.getDenominator() - f.getNumerator() * denominator;
		d = denominator * f.getDenominator();
		for (int i = Math.min(Math.abs(n), Math.abs(d)); i >= 2; i--) {
			if (n % i == 0 && d % i == 0) {
			n /= i;
			d /= i;
		}
	}
	
		if (n == 0) {
			d = 1;
	}
		return new Fraction (n, d);
	}
	
		//same as add method but multiples
		public Fraction multiply(Fraction f) {
			int n = 0;
			int d = 0;
		
			n = numerator * f.getNumerator();
			d = denominator * f.getDenominator();
		
			for (int i = Math.min(Math.abs(n), Math.abs(d)); i >= 2; i--) {
				if (n % i == 0 && d % i == 0) {
				n /= i;
				d /= i;
			}
		}
			if (n == 0) {
				d = 1;
		}
			return new Fraction (n, d);
	}
		//same as add method but divides
		public Fraction divide(Fraction f) throws IllegalArgumentException{
			int n = 0;
			int d = 0;
		
			n = numerator * f.getDenominator();
			d = denominator * f.getNumerator();
		
			if (d == 0) {
			throw new IllegalArgumentException("denominator cannot be 0");
		}
		
			for (int i = Math.min(Math.abs(n), Math.abs(d)); i >= 2; i--) {
			if (n % i == 0 && d % i == 0) {
			n /= i;
			d /= i;
		}
	}
		
			if (n == 0) {
				d = 1;
		}
		
			return new Fraction (n, d);
		}
		public int compareTo(Fraction f) {
			if (numerator == f.getNumerator() && denominator == f.getDenominator()) {
				return 0;
		}
	
			if ((double) (numerator) / denominator < (double)(f.getNumerator()) / f.getDenominator()){
				return -1;
		}else {
			return 1;
	   }
	  }
	
		// returns as string type
		public String toString() {
			if (denominator == 1 || numerator == 0) {
				return numerator + "";
			}
		
			return numerator + "/" + denominator;
		}
		
		// return the mixed fraction as string
		public String toMixedNumberString() {
			if (Math.abs(numerator) <= denominator || numerator == 0 || denominator == 1) {
				if (denominator == 1 || numerator == 0) {
					return numerator + "";
		}
		
			return numerator + "/" + denominator;
		
		}
		
			return (numerator / denominator) + "_" + Math.abs(numerator % denominator) + "/" + denominator;
		}
	
	}
		
