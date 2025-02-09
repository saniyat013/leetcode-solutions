package com.saniyat.problemSolving.leetcodeSolutions.neetcode150.arraysnhashing;

import java.util.HashSet;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}

		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(containsDuplicate(nums));
	}

}
