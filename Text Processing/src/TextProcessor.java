
public class TextProcessor {

	public static void main(String[] args) {
		System.out.println(toUpperCase("tro lo lo"));

	}
	public static boolean isLowerCase(char c) {
		return c >= 'a' && c<= 'z';	
	}
	
	public static char toUpperCase(char c) {
		if (isLowerCase(c)) {
			return (char)(c-'a'+'A');
		}
		else {
			return c;
		}
	}

	public static String toUpperCase(String s) {
		String total = "";
		for (int i = 0; i <= s.length()-1; i++) {
			total += toUpperCase(s.charAt(i));
		}
		return total;
	}
	public static int compareToIgnoreCase(String s, String t) {
		int st = Math.min(s.length(),t.length());
		s = toUpperCase(s);
		t = toUpperCase(t);
		for (int i = 0; i < st; i++) {
			int diff = s.charAt(i) - s.charAt(i);
			if (diff!= 0) {
				return diff;
			}
		}
		return s.length() - t.length();
	}
}
