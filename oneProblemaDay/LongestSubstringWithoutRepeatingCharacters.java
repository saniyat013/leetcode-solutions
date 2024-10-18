package com.saniyat.problemSolving.leetcodeSolutions.oneProblemaDay;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> charSet = new HashSet<>();
		int maxSubString = 0, i = 0, j = 0;

		while (j < s.length()) {
			if (charSet.add(s.charAt(j))) {
				maxSubString = Math.max(maxSubString, charSet.size());
				j++;
			} else {
				charSet.remove(s.charAt(i++));
			}
		}

		return maxSubString;
	}

	public static void main(String[] args) {
		String s = "  ";
//		String s = "pwwkew";
//		String s = "dvdf";
//		String s = "abcddefgh";
		System.out.printf("RESULT: %d", lengthOfLongestSubstring(s));
	}
}
