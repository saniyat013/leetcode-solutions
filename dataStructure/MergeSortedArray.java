package problems.dataStructure;

import java.util.Arrays;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int index = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[index--] = nums1[i--];
			} else {
				nums1[index--] = nums2[j--];
			}
		}

		while (j >= 0) {
			nums1[index--] = nums2[j--];
		}

		System.out.println(Arrays.toString(nums1));
	}

	public static void main(String[] args) {
		int nums1[] = { 0 };
		int nums2[] = { 1 };
		int m = 0, n = 1;

		merge(nums1, m, nums2, n);
	}

}
