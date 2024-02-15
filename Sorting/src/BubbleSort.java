/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

//sorts array using the BubbleSort sorting method
public class BubbleSort implements ISorter{
	public ISortStats sort(int[] a) {
	int numMoves = 0;
	long numNanoseconds = System.nanoTime();
	for (int i = a.length - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (a[j] > a[j + 1]) {
				//swapper
				int temp = a[j];
				a[j] = a[j+1];		
				a[j+1] = temp;
				numMoves += 3;
			}
		}
	}	
	numNanoseconds = System.nanoTime() - numNanoseconds;
	return new SortStats("BubbleSort", a.length, a.length * (a.length - 1) / 2, numMoves, numNanoseconds);
	}	
}
