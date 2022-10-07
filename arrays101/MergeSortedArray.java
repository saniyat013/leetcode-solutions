package problems.arrays101;

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

		for (int x : nums1) {
			System.out.print(x + ", ");
		}
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		int m = 3, n = 3;

		merge(nums1, m, nums2, n);
	}
}
