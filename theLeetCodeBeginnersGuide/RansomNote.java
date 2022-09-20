package problems.theLeetCodeBeginnersGuide;

import java.util.HashMap;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> magzMap = new HashMap<>();
		char currentChar;
		int currentCount;

		for (int i = 0; i < magazine.length(); i++) {
			currentChar = magazine.charAt(i);

			currentCount = magzMap.getOrDefault(currentChar, 0);
			magzMap.put(currentChar, currentCount + 1);
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			currentChar = ransomNote.charAt(i);

			currentCount = magzMap.getOrDefault(currentChar, 0);

			if (currentCount == 0)
				return false;

			magzMap.put(currentChar, currentCount - 1);
		}

		return true;
	}

	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "ab";
		System.out.println(canConstruct(ransomNote, magazine));
	}
}
