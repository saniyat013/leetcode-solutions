package com.saniyat.problemSolving.leetcodeSolutions.arrays101;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		// First Approach
//		int count = 0;
//		int i = 0;
//
//		while (i < nums.length && nums.length - i > count) {
//			if (nums[i] == val) {
//				count++;
//				for (int j = i + 1; j < nums.length; j++) {
//					nums[j - 1] = nums[j];
//				}
//			} else {
//				i++;
//			}
//		}

		// Optimal Solution
//		int i = 0;
//		for (int j = 0; j < nums.length; j++) {
//			if (nums[j] != val) {
//				nums[i] = nums[j];
//				i++;
//			}
//		}

		// When less elements to remove
		int i = 0;
		int n = nums.length - 1;

		while (i <= n) {
			if (nums[i] == val) {
				nums[i] = nums[n--];
			} else {
				i++;
			}
		}

		System.out.println("Count: " + i);
		for (int x : nums) {
			System.out.print(x + ", ");
		}

		return i;
	}

	public static void main(String[] args) {
//		int[] nums = { 3, 2, 2, 3 };
//		int val = 3;
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;

		removeElement(nums, val);
	}
}
