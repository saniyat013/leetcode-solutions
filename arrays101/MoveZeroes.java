package problems.arrays101;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int i = 0, j = 0;

		while (j < nums.length) {
			if (nums[j] != 0) {
				nums[i] = nums[j];
				i++;
				j++;
			} else {
				j++;
			}
		}

		for (int k = i; k < nums.length; k++) {
			nums[k] = 0;
		}

		for (int x : nums) {
			System.out.print(x + ", ");
		}
	}

	public static void main(String[] args) {
//		int[] nums = { 0, 1, 0, 3, 12 };
		int[] nums = { 0 };
		moveZeroes(nums);
	}
}
