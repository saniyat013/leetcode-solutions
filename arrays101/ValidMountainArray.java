package com.saniyat.problemSolving.leetcodeSolutions.arrays101;

import java.util.Iterator;

public class ValidMountainArray {
	public static boolean validMountainArray(int[] arr) {
		int len = arr.length;

		if (len < 3)
			return false;

		int i = 0;

		while (i + 1 < len && arr[i] < arr[i + 1]) {
			i++;
		}

		if (i == 0 || i == len - 1)
			return false;

		while (i + 1 < len && arr[i] > arr[i + 1]) {
			i++;
		}

		return i == len - 1;
	}

	public static void main(String[] args) {
//		int[] arr = { 0, 3, 2, 1 };
//		int[] arr = { 3,5,5 };
//		int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0 };
		int[] arr = { 0, 2, 3, 3, 5, 2, 1, 0 };

		System.out.println(validMountainArray(arr));
	}
}
