/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

// main method class
import java.util.*;
public class Program {
	public static void main(String[] args) {
		ISorter[] sorters = {new BubbleSort(), new SelectionSort(), new InsertionSort(), new MergeSort()};
		
		System.out.println("Test 1: Different Array Lengths");
		for (int i = 1; i <= 4096; i *= 2) {
			int[] a = new int[i];
			for (int j = 0; j < i; j++) {
				a[j] = (int) (Math.random() * 100); 
			}
			for (int j = 0; j < sorters.length; j++) {
				int[] b = Arrays.copyOf(a, a.length);
				ISortStats stats = sorters[j].sort(b);
				System.out.println("\nSorted: " + Check.isInOrder(b));
				System.out.println(stats.toString());
			}
		}
		
		System.out.println("\nTest 2: Reverse and Sorted Arrays");
		int[] a = new int[4096];
		int x = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			x -= (int)(Math.random() * 4096 + 1);
			a[i] = x;
		}
		
		for (int j = 0; j < sorters.length; j++) {
			int[] b = Arrays.copyOf(a, a.length);
			//reversed array 
			System.out.println("\nSorting reverse order array:");
			ISortStats stats1 = sorters[j].sort(b);
			System.out.println("\nSorted: " + Check.isInOrder(b));
			System.out.println(stats1.toString());
			System.out.println();
			
			
			//sorted array
			System.out.println("Sorting already sorted array:");
			ISortStats stats2 = sorters[j].sort(b);
			System.out.println("\nSorted: " + Check.isInOrder(b));
			System.out.println(stats2.toString());
		}		
	}
}
