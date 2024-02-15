/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

//sorts array using the SelectionSort sorting method
public class SelectionSort implements ISorter{
	public ISortStats sort(int[] a) {
		int numMoves = 0;
		long numNanoseconds = System.nanoTime();
		for (int i = 0; i < a.length - 1; i++) {
			int x = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[x]) {
					x = j;
				}
			}
			if (i != x) {
				//swapper
				int temp = a[i];
				a[i] = a[x];
				a[x] = temp;
				numMoves += 3;
			}
		}
		numNanoseconds = System.nanoTime() - numNanoseconds;
		return new SortStats("SelectionSort", a.length, a.length * (a.length + 1) / 2, numMoves, numNanoseconds);
	}
}
