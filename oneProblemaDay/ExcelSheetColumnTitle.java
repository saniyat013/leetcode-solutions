package problems.oneProblemaDay;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int columnNumber) {
		char[] characters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		String s = "";

		while (columnNumber > 0) {
			if(columnNumber % 26 == 0) {
				
			}
			int index = columnNumber % 26;
			if (index == 0) {
				s = characters[25] + s;
				break;
			} else {
				s = characters[index - 1] + s;
			}
			columnNumber = columnNumber / 26;
		}

		return s;
	}

	public static void main(String[] args) {
		int n = 52;
		System.out.println(convertToTitle(n));
	}

}
