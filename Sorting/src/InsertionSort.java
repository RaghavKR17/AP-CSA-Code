/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

//sorts array using the InsertionSort sorting method
public class InsertionSort implements ISorter{
	public ISortStats sort(int[] a) {
	// stats variables
	int numComparisons = 0;
	int numMoves = 0;
	long numNanoseconds = System.nanoTime();
	for (int i = 1; i < a.length; i++) {
		int x = a[i];
		numMoves++;
		int j = i - 1;
			while (j >= 0 && a[j] > x) {
				numComparisons++;
				a[j + 1] = a[i];
				numMoves++;
				j--;
			}
			numComparisons++;
			a[j + 1] = x;
			numMoves++;
		}
		numNanoseconds = System.nanoTime() - numNanoseconds;
		return new SortStats("InsertionSort", a.length, numComparisons, numMoves, numNanoseconds);
	}
}
