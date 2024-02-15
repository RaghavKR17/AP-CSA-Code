//Raghav Krishna Ranganathan
//Peterson Period 5
//4/1/22
import java.util.*;

//makes the board
public class Board {
	WordList wordList;
	char[][] board;
	public Board(WordList wordList, int size) {
		this.wordList = wordList;
		this.board = new char[size][size];
		initiateBoard();
	}
	private void initiateBoard() {
		Random rn = new Random();
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j ++) {
				String s = wordList.get(rn.nextInt(wordList.size()));
				char c = Character.toUpperCase(s.charAt(rn.nextInt(s.length())));
				board[i][j] = c;
			}
		}
	}
	// find solutions using WordList
	public ArrayList<String> find() {
		ArrayList<String> solution = new ArrayList<String>();
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j ++) {
				find (i, j, solution, "", new boolean[board.length][board[0].length]);
			}
		}
		Collections.sort(solution, new WordComparator());
		return solution;
	}
	// helper method
	private void find(int x, int y,  ArrayList<String> solution, String word, boolean[][] marker) {
		if (x > board.length - 1 || x < 0 || y > board[0].length - 1 || y < 0 || marker[x][y]) {
			return;
		}
		word += board[x][y];
		marker[x][y] = true;
		if (wordList.contains(word) && !solution.contains(word)) {
			solution.add(word);
		}
		
		if (word.length() != wordList.getLongestWordLength()) {
			find(x-1, y, solution, word, copyMarker(marker));
			find(x, y-1, solution, word, copyMarker(marker));
			find(x+1, y, solution, word, copyMarker(marker));
			find(x, y+1, solution, word, copyMarker(marker));
			find(x-1, y-1, solution, word, copyMarker(marker));
			find(x-1, y+1, solution, word, copyMarker(marker));
			find(x+1, y-1, solution, word, copyMarker(marker));
			find(x+1, y+1, solution, word, copyMarker(marker));
		}
	}
	// mark previously traveled squares
	private boolean[][] copyMarker(boolean[][] marker1) {
		boolean[][] marker2 = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j ++) {
				marker2[i][j] = marker1[i][j];
			}
		}
		return marker2;
	}
	// format for board
	public String toString() {
		String res = "";
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j ++) {
				res += board[i][j] + " ";
			}
			res += "\n";
		}
		return res.toUpperCase();
	}
}
