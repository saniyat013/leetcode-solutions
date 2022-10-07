package problems.arrays101;

public class SquaresofaSortedArray {
	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int i = 0, j = nums.length - 1;

		for (int k = j; k >= 0; k--) {
			if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
				result[k] = nums[i] * nums[i];
				i++;
			} else {
				result[k] = nums[j] * nums[j];
				j--;
			}
		}

		return result;
	}

	public static void main(String[] args) {
//		int[] nums = { -4, -1, 0, 3, 10 };
		int[] nums = { -7, -3, 2, 3, 11 };

		int[] result = sortedSquares(nums);

		for (int n : result) {
			System.out.printf("%d, ", n);
			;
		}
	}
}
