package problems.datastructure;

import java.util.HashSet;

public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board) {
		HashSet<Character> rowCheck = new HashSet<Character>();
		HashSet<Character> colCheck = new HashSet<Character>();

		for (int i = 0; i < board[0].length; i++) {
			rowCheck.clear();
			colCheck.clear();

			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					if (colCheck.contains(board[i][j])) {
						return false;
					} else {
						colCheck.add(board[i][j]);
					}
				}

				if (board[j][i] != '.') {
					if (rowCheck.contains(board[j][i])) {
						return false;
					} else {
						rowCheck.add(board[j][i]);
					}
				}
			}
		}

		HashSet<Character> boxCheck = new HashSet<Character>();

		for (int i = 0; i < board[0].length; i += 3) {
			for (int j = 0; j < board[0].length; j += 3) {
				boxCheck.clear();

				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (board[m][n] != '.') {
							if (boxCheck.contains(board[m][n])) {
								return false;
							} else {
								boxCheck.add(board[m][n]);
							}
						}
					}
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
//		char[][] board = new char[][] {
//	        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
//	        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
//	        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
//	        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
//	        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
//	        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
//	        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
//	        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
//	        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
//	    };
		
		char[][] board = new char[][] {
	        { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
	        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
	        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
	        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
	        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
	        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
	        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
	        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
	        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
	    };
	    
		System.out.println((isValidSudoku(board) ? "YES" : "NO"));
	}

}
