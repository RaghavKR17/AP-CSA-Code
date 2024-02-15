//Raghav Krishna Ranganathan
//Peterson Period 5
//4/1/22

import java.util.ArrayList;

// calls different methods, prints board, organizes solutions

public class Program {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Boggle, by Raghav Krishna Ranganathan");
		WordList wordList = new WordList("src\\WordList.txt", 3, 8);
		Board board = new Board(wordList, 4);
		System.out.println(board);
		ArrayList<String> Solutions = board.find();
		
		System.out.println("Found " + Solutions.size() + " word(s) \n");
		System.out.println(Solutions.get(0).length() + " letter words");
		System.out.println(Solutions.get(0));
		for (int i = 1; i < Solutions.size(); i ++) {
			if (Solutions.get(i).length() != Solutions.get(i-1).length()) {
				System.out.println("\n" + Solutions.get(i).length() + " letter words");
			}
			System.out.println(Solutions.get(i));

		}
	}
}
