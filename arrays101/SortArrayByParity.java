package com.saniyat.problemSolving.leetcodeSolutions.arrays101;

public class SortArrayByParity {
	public static int[] sortArrayByParity(int[] nums) {
		int i = 0, j = 1, temp;

		while (j < nums.length) {
			if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j++;
			} else if (nums[i] % 2 == 0 && nums[j] % 2 != 0) {
				i++;
			} else {
				j++;
			}
		}

		for (int x : nums) {
			System.out.print(x + ", ");
		}
		return nums;
	}

	public static void main(String[] args) {
//		int[] nums = { 3, 1, 2, 4, 3, 5, 6, 8, 3, 4, 5, 6, 7, 8, 2, 4, 6, 8, 3, 2, 4, 6 };
		int[] nums = { 0, 2 };
		sortArrayByParity(nums);

	}

}
