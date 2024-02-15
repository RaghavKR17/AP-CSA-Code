// Raghav K.Ranganathan, APCS P5	
// Fraction Programming Project: BigFraction (Extra Credit)
// 1/30/2022

// import BigInteger
import java.math.BigInteger;

// major class with methods
public class BigFraction {
	private BigInteger numerator;
	private BigInteger denominator;
	
	//constructors
	public BigFraction(BigInteger numerator, BigInteger denominator) {
		// check if denominator is 0
		if(denominator.signum() == 0) {
			throw new IllegalArgumentException("Denominator cannot be 0.");
		}
		
		// simplify
		BigInteger gcd = numerator.gcd(denominator).divide(denominator.divide(denominator.abs()));
		this.numerator = numerator.divide(gcd);
		this.denominator = denominator.divide(gcd);
	}
	public BigFraction(BigInteger n) {
		this (n + "/1");
	}
	public BigFraction(int numerator, int denominator) {
		this (numerator + "/" + denominator);
	}
	public BigFraction(int n) {
		this (n, 1);
	}
	public BigFraction(String str) {
		this (new BigInteger(str.split("/")[0]), new BigInteger(str.split("/")[1]));
	}
	
	//accessors
	public BigInteger getNumerator() {
		return numerator;
	}
	public BigInteger getDenominator() {
		return denominator;
	}
	
	//operators
	public BigFraction add(BigFraction f) {
		return new BigFraction(numerator.multiply(f.denominator).add(f.numerator.multiply(denominator)), denominator.multiply(f.denominator));
	}
	public BigFraction subtract(BigFraction f) {
		return this.add(new BigFraction(f.numerator.negate(), f.denominator));
	}
	public BigFraction multiply(BigFraction f) {
		return new BigFraction(numerator.multiply(f.numerator), denominator.multiply(f.denominator));
	}
	public BigFraction divide(BigFraction f) {
		return this.multiply(new BigFraction(f.denominator, f.numerator));
	}
	
	//return as string
	public String toString() {
		if(denominator.equals(BigInteger.ONE)) {
			return "" + numerator;
		}
		return numerator + "/" + denominator;
	}
	
	//return as string (mixed number)
	public String toMixedNumberString() {
		if(denominator.equals(BigInteger.ONE) || numerator.divide(denominator).signum() == 0) {
			return toString();
		}
		return numerator.divide(denominator) + "_" + numerator.abs().mod(denominator) + "/" + denominator;
	}
	
	//compare to other one
	public int compareTo(BigFraction f) {
		// get numerator sign by subracting
		return this.subtract(f).numerator.signum();
	}
}