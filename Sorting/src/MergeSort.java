/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

//sorts array using the MergeSort sorting method
import java.util.Arrays;

public class MergeSort implements ISorter {
	// stats variables
	private int numMoves;
	private int numComparisons;
	public MergeSort() {
		numMoves = 0;
		numComparisons = 0;
	}

	public ISortStats sort(int[] a) {
		long numNanoseconds = System.nanoTime();
		mergeSort(a);
		numNanoseconds = System.nanoTime() - numNanoseconds;
		return new SortStats("MergeSort", a.length, numComparisons, numMoves, numNanoseconds);
	}
	
	private void mergeSort(int[] a) {
		if (a.length > 1) {
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}
	}
	
	private void merge(int[] res, int[] left, int[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < res.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				res[i] = left[i1];
				i1++;
				if (i2 < right.length) {
					numComparisons++;
				}
			} else {
				res[i] = right[i2];
				i2++;
				numComparisons++;
			}
			numMoves++;
		}
	}
}
