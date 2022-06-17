package problems.datastructure;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		Set<Character> charSet = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (charSet.contains(c)) {
				if (charMap.get(c) != null) {
					charMap.remove(c);
				}
			} else {
				charMap.put(c, i);
				charSet.add(c);
			}
		}

		return charMap.size() == 0 ? -1 : charMap.entrySet().iterator().next().getValue();
	}

	public static void main(String[] args) {
		String s = "leetcode";

		System.out.println(firstUniqChar(s));

	}

}
