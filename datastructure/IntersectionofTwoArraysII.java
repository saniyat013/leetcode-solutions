package problems.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoArraysII {
//	Array Solution
//	public static int[] intersect(int[] nums1, int[] nums2) {
//		int numCount[] = new int[1000 + 1];
//
//		for (int i = 0; i < nums1.length; i++) {
//			numCount[nums1[i]] += 1;
//		}
//
//		ArrayList<Integer> arrList = new ArrayList<>();
//
//		for (int j = 0; j < nums2.length; j++) {
//			if (numCount[nums2[j]] > 0) {
//				arrList.add(nums2[j]);
//				numCount[nums2[j]]--;
//			}
//		}
//		
//		numCount = new int[arrList.size()];
//		
//		for(int k = 0; k < numCount.length; k++) {
//			numCount[k] = arrList.get(k);
//		}
//
//		return numCount;
//	}

//	Hashmap Solution
	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> numCount = new HashMap<>();

		for (int n : nums1) {
			numCount.put(n, (numCount.getOrDefault(n, 0) + 1));
		}

		ArrayList<Integer> arrList = new ArrayList<>();

		for (int m : nums2) {
			if (numCount.containsKey(m) && numCount.get(m) > 0) {
				arrList.add(m);
				numCount.put(m, numCount.get(m) - 1);
			}
		}

		int result[] = new int[arrList.size()];

		int index = 0;
		for (int x : arrList) {
			result[index++] = x;
		}

		return result;
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };

		System.out.println(intersect(nums1, nums2));
	}

}
