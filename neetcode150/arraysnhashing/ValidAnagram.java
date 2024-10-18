package com.saniyat.problemSolving.leetcodeSolutions.neetcode150.arraysnhashing;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		char[] store = new char[26];
		for (int i = 0; i < s.length(); i++) {
			store[s.charAt(i) - 'a']++;
		}

		for (int j = 0; j < t.length(); j++) {
			if (store[t.charAt(j) - 'a'] == 0) {
				return false;
			}
			store[t.charAt(j) - 'a']--;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagarams";

		System.out.println(isAnagram(s, t));

	}

}
