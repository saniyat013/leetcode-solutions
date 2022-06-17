package problems.datastructure;

import java.util.HashMap;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
//		if (magazine.length() < ransomNote.length())
//			return false;
//		
//		HashMap<Character, Integer> ransMap = new HashMap<>();
//		HashMap<Character, Integer> magzMap = new HashMap<>();
//		
//		for(int i = 0; i < ransomNote.length(); i++) {
//			char c1 = ransomNote.charAt(i);
//			if(ransMap.containsKey(c1)) {
//				ransMap.put(c1, ransMap.get(c1) + 1);
//			} else {
//				ransMap.put(c1, 1);
//			}
//		}
//		System.out.println(ransMap);
//		
//		for(int i = 0; i < magazine.length(); i++) {
//			char c2 = magazine.charAt(i);
//			if(magzMap.containsKey(c2)) {
//				magzMap.put(c2, magzMap.get(c2) + 1);
//			} else {
//				magzMap.put(c2, 1);
//			}		
//		}
//		System.out.println(magzMap);
//		
//		System.out.println(ransMap.keySet());
//		for(char c3 : ransMap.keySet()) {
//			if(magzMap.containsKey(c3)) {
//				if(magzMap.get(c3) < ransMap.get(c3)) {
//					System.out.println(c3 + " " + magzMap.get(c3));
//					System.out.println(c3 + " " + ransMap.get(c3));
//					return false;
//				}
//			} else {
//				return false;
//			}
//		}
//		
//		return true;

		int[] counter = new int[26];

		for (char c : magazine.toCharArray())
			counter[c - 'a']++;

		for (char c : ransomNote.toCharArray()) {
			if (counter[c - 'a'] == 0)
				return false;
			counter[c - 'a']--;
		}

		return true;
	}

	public static void main(String[] args) {
		String ransomNote = "a";
		String magazine = "b";

		System.out.println(canConstruct(ransomNote, magazine));
	}

}
