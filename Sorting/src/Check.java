/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 
// checks if array is in order
public class Check {
	public static boolean isInOrder(int[] a) {
		for(int i = 0; i < a.length-1; i++) {
			if (a[i] < a[i + 1]) {
				return false;
			}
		}		
		return true;
	}
}
