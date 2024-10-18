package com.saniyat.problemSolving.leetcodeSolutions.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//	Bruteforce Solution O(n2)
//	public int[] twoSum(int[] nums, int target) {
//		int result[] = new int[2];
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					result[0] = i;
//					result[1] = j;
//				}
//			}
//		}
//
//		return result;
//	}

//	Using Hashmap O(n)
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> myMap = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			if (myMap.containsKey(target - nums[i])) {
				return new int[] { myMap.get(target - nums[i]), i };
			}

			myMap.put(nums[i], i);
		}

		return null;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;

		TwoSum ts = new TwoSum();
		for (int i = 0; i < ts.twoSum(nums, target).length; i++) {
			System.out.printf("%d", i);
		}
	}

}
