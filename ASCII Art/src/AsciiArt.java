public class AsciiArt {

    public static final int SCALE = 1;

	public static void main(String[] args) {
		for (int i = 1; i <= SCALE; i++) {
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("0");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("_");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("0");
			}
			System.out.println("");
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			System.out.println("");
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			for (int j = 1; j <= SCALE; j++) {
				System.out.print("|");
			}
			System.out.println("");
			System.out.println("");
		
		}
	
	}


}
