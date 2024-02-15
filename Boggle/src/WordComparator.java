//Raghav Krishna Ranganathan
//Peterson Period 5
//4/1/22
import java.util.Comparator;

// comparator method
public class WordComparator implements Comparator<String>{
	public int compare(String o1, String o2) {
		if (o1.length() > 0 && o2.length() > 0 && o2.length() - o1.length() != 0) {
			return o2.length() - o1.length();
		} else {
			return o1.compareTo(o2);
		}
	}
	
}
