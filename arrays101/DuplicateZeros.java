package com.saniyat.problemSolving.leetcodeSolutions.arrays101;

public class DuplicateZeros {
	public static void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 && i < arr.length - 1) {
				for (int j = arr.length - 1; j > i; j--) {
					arr[j] = arr[j - 1];
				}
				arr[++i] = 0;
			}
		}

		for (int n : arr) {
			System.out.printf("%d ,", n);
		}
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
//		int[] arr = { 0, 0, 0, 0, 0, 0, 0, };
		int[] arr = { 0, 4, 1, 0, 0, 8, 0, 0, 3 };
		duplicateZeros(arr);
	}
}
