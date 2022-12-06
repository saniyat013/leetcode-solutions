package problems.arrays101;

public class RemoveDuplicatesfromSortedArray2 {
	public static int removeDuplicates(int[] nums) {
		int i = 0, j = 1;

		while (j < nums.length) {
			if(nums[i] == nums[j]) {
				j++;
			} else {
				nums[++i] = nums[j++];
			}
		}

		for (int x : nums) {
			System.out.print(x + ",");
		}

		return i + 1;
	}

	public static void main(String[] args) {
//		int[] nums = { 1, 1, 1, 1, 2, 3 };
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
//		int[] nums = { 1, 2, 3, 4};
		System.out.println("Result:" + removeDuplicates(nums));

	}

}
