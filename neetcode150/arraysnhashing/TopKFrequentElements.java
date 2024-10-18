package com.saniyat.problemSolving.leetcodeSolutions.neetcode150.arraysnhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequentElements {
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> myMap = new HashMap<>();
		for (int n : nums) {
			myMap.put(n, myMap.getOrDefault(n, 0) + 1);
		}

		List<Integer>[] bucketList = new List[nums.length + 1];
		for (int n : myMap.keySet()) {
			int freq = myMap.get(n);
			if (bucketList[freq] == null) {
				bucketList[freq] = new LinkedList<>();
			}
			bucketList[freq].add(n);
		}

		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
//		int[] nums = { 1 };
		int k = 2;

		System.out.println((topKFrequent(nums, k)));
	}

}
