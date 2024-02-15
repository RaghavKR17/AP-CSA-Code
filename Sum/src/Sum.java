//Raghav K. Ranganathan
//APCS P5
//Sum - Programming Project
//12/17/21


// Runs a program that gives a sum of lines containing numericals.This happens in a file while using arrays.

import java.util.*;
import java.io.*;

public class Sum {
	public static int ARRAY_LENGTH=25;

	public static void main(String[] args) throws FileNotFoundException {
		int numoflines=0;
		Scanner fileNum=new Scanner(new File("sum2.txt"));
		while(fileNum.hasNext()) {
			String line=fileNum.nextLine();
			if(line!="") {
				codeLine(line);
				numoflines = numoflines + 1; 
			}
		}
		System.out.printf("Total lines = %d",numoflines);
	}
	


	private static void codeLine(String line) {
		//checks if the String line has 1 char
		Scanner scanLine=new Scanner(line);
		int[] add=new int[ARRAY_LENGTH];
		int[] sum=new int[ARRAY_LENGTH];
		String num=scanLine.next();
		strarray(num,add);
		arraySum(add,sum);
		String ans=num;
		while(scanLine.hasNext()) {
			num=scanLine.next();
			strarray(num,add);
			arraySum(add,sum);
			ans+=" + "+arraystr(add);
		}
		//prints sum of file's line (a.k.a variable "ans")
		String finalans=arraystr(sum);
		ans+=" = "+finalans;
		System.out.println(ans);
	}
	
	public static void strarray(String number,int[] array) {
		//checks if all characters in String are numerical
		for(int x=0;x<ARRAY_LENGTH;x++) {
			int diff=ARRAY_LENGTH-number.length();
			if(x<diff) {
				array[x]=0;
			}
			else {
				//moves string to integer array (on the left)
				array[x]=Character.getNumericValue(number.charAt(x-diff));
			}
		}
	}
	
	
	public static void arraySum(int[] add,int[] finalans) {
		//adds using method plus rewrites 2nd array (using variable "finalans")
		int carry=0;
		for(int x=ARRAY_LENGTH-1;x>=0;x--) {
			int sum=finalans[x]+add[x]+carry;
			finalans[x]=sum%10;
			carry=(sum-sum%10)/10;
		}
	}
	
	
	public static String arraystr(int[] array) {
		//creates string with values of array (no 0)
		String finalans="";
		if(zeroCheck(array)) {
			finalans="0";
		}
		else {
			int x=0;
			while(array[x]==0) {
				x++;
			}
			while(x<ARRAY_LENGTH) {
				finalans+=array[x];
				x++;
			}
		}
		return finalans;
	}

	public static boolean zeroCheck(int[] array) {
		//returns boolean "true" if all values of array equal 0
		for(int y:array) {
			if(y!=0) {
				return false;
			}
		}
		return true;
	}

}
