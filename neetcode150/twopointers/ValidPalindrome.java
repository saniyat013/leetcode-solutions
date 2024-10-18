package com.saniyat.problemSolving.leetcodeSolutions.neetcode150.twopointers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
//	Using built in functions and extra memory
//	public static boolean isPalindrome(String s) {
//		String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//		StringBuilder s2 = new StringBuilder(s1);
//
//		if (s1.equals(s2.reverse().toString()))
//			return true;
//
//		return false;
//	}

//	Not using extra memory
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		Character start, end;

		while (i < j) {
			start = s.charAt(i);
			end = s.charAt(j);

			if (!Character.isLetterOrDigit(start)) {
				i++;
				continue;
			}

			if (!Character.isLetterOrDigit(end)) {
				j--;
				continue;
			}

			if (Character.toLowerCase(start) != Character.toLowerCase(end))
				return false;

			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
//		String s = "A man, a plan, a canal: Panama";
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}

}
