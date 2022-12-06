package problems.dataStructure;

import java.util.Arrays;

public class KthLargestElementinanArray {
	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);

		int n = nums.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[n - i - 1];
			nums[n - i - 1] = temp;
		}

		return nums[k - 1];
	}

	public static void main(String[] args) {
		int nums[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;

		System.out.println(findKthLargest(nums, k));
	}

}
