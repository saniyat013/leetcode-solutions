package problems.neetcode150.arraysnhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
//		My Solution, redundant and bulky
//		HashMap<Character, Integer> tupleMap = new HashMap<>();
//		HashMap<String, List<String>> resultMap = new HashMap<>();
//
//		for (String str : strs) {
//			tupleMap.clear();
//			for (int i = 0; i < str.length(); i++) {
//				if (tupleMap.containsKey(str.charAt(i))) {
//					tupleMap.put(str.charAt(i), tupleMap.get(str.charAt(i)) + 1);
//				} else {
//					tupleMap.put(str.charAt(i), 1);
//				}
//			}
//
//			String touple = "";
//			
//			ArrayList<Character> sortedKeys = new ArrayList<>(tupleMap.keySet());
//			Collections.sort(sortedKeys);
//
//			for (Character character : sortedKeys) {
//				touple += character + Integer.toString(tupleMap.get(character));
//			}
//			
//			System.err.println(touple);
//			System.out.println("map" + tupleMap);
//
//			List<String> tempList;
//			if (resultMap.containsKey(touple)) {
//				tempList = resultMap.get(touple);
//				tempList.add(str);
//				resultMap.put(touple, tempList);
//			} else {
//				tempList = new ArrayList<>();
//				tempList.add(str);
//				resultMap.put(touple, tempList);
//			}
//		}
//
//		List<List<String>> resultList = new ArrayList<>();
//		for (List results : resultMap.values()) {
//			resultList.add(results);
//		}
//
//		return resultList;

//		Standard Solution
		if (strs == null || strs.length == 0)
			return new ArrayList<>();

		Map<String, List<String>> resultMap = new HashMap<>();

		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);

			String key = String.valueOf(ch);

			if (!resultMap.containsKey(key))
				resultMap.put(key, new ArrayList<>());

			resultMap.get(key).add(str);
		}
		return new ArrayList<>(resultMap.values());
	}

	public static void main(String[] args) {
//		String[] strs = { "[[\"mud\"],[\"kin\"],[\"tat\"],[\"jug\"],[\"dam\"],[\"tux\"],[\"bur\"],[\"ron\"],[\"ski\"],[\"cad\"],[\"rob\"],[\"gay\"],[\"joy\"],[\"yak\"],[\"mid\"],[\"set\"],[\"ken\"],[\"sin\"],[\"nip\",\"nip\"],[\"rca\"],[\"eat\"],[\"ark\",\"ark\"],[\"oaf\",\"oaf\"],[\"any\"],[\"don\"],[\"pus\",\"sup\"],[\"jay\"],[\"pug\"],[\"gad\"],[\"rub\"],[\"sue\"],[\"cob\"],[\"hug\"],[\"lox\"],[\"luz\"],[\"new\"],[\"chi\"],[\"sac\"],[\"ago\"],[\"hos\",\"ohs\"],[\"fan\"],[\"kid\"],[\"ode\"],[\"dot\",\"dot\"],[\"lab\"],[\"sob\"],[\"eon\"],[\"wad\"],[\"axe\"],[\"maj\"],[\"ton\"],[\"del\"],[\"nit\"]]", "[[\"del\"],[\"eon\"],[\"dam\"],[\"tat\"],[\"gad\"],[\"luz\"],[\"wad\"],[\"kin\"],[\"eat\"],[\"cob\"],[\"ski\"],[\"bur\",\"rub\"],[\"new\"],[\"sue\"],[\"pug\"],[\"ark\",\"ark\"],[\"dot\",\"dot\"],[\"maj\"],[\"ken\"],[\"sob\"],[\"ton\"],[\"sin\"],[\"gay\"],[\"nit\"],[\"ode\"],[\"joy\"],[\"rob\"],[\"ron\"],[\"lox\"],[\"kid\"],[\"mid\"],[\"nip\",\"nip\"],[\"mud\"],[\"lab\"],[\"ago\"],[\"oaf\",\"oaf\"],[\"don\"],[\"chi\"],[\"rca\"],[\"fan\"],[\"pus\",\"sup\"],[\"jay\"],[\"hos\",\"ohs\"],[\"cad\"],[\"yak\"],[\"any\"],[\"sac\"],[\"jug\"],[\"tux\"],[\"hug\"],[\"axe\"],[\"set\"]]" };
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
		;
	}

}
