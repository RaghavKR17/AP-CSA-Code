
public class Loop {

	public static void main(String[] args) {
		for(int u = 0; u < 4; u +=1) {
			for(int i = 4; i > 0; i-=1) {
				System.out.println("");
				for(int j = i; j > 0; j-=1) {
					System.out.print("/");
				}			
			}
		}

	}
}
