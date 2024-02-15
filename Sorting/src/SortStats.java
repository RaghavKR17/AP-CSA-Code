/* Raghav Krishna Ranganathan
4/23/22
Peterson P5
*/ 

// helps process data for sorting
public class SortStats implements ISortStats{
	private String Algorithm;
	private int NumItems;
	private int NumComparisons;
	private int NumMoves;
	private long NumNanoseconds;
	
	// Constructor
	public SortStats(String algorithm, int numItems, int numComparisons, int numMoves, long numNanoseconds) {
		this.Algorithm = algorithm;
		NumItems = numItems;
		NumComparisons = numComparisons;
		NumMoves = numMoves;
		NumNanoseconds = numNanoseconds;
	}
	
	//Getter methods
	public int getNumItems() {
		return NumItems;
	}

	public String getAlgorithm() {
		return Algorithm;
	}


	public int getNumComparisons() {

		return NumComparisons;
	}
	
	public int getNumMoves() {
		return NumMoves;
	}
	public long getNumNanoseconds() {
		return NumNanoseconds;
	}
	
	//toString method
	public String toString() {
		return "\"Algorithm\"\t: \"<" + Algorithm + ">\","
				+ "\n\"NumItems\"\t: \"<" + NumItems + ">\","
						+ "\n\"NumComparisons\": \"<" + NumComparisons + ">\","
								+ "\n\"NumMoves\"\t: \"<" + NumMoves + ">\"," 
										+ "\n\"NumNanoseconds\": \"<" + NumNanoseconds + ">\"";
	}
}
