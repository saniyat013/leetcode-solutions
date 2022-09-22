package problems.oneProblemaDay;

public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		i++;

		System.out.printf("i: %d", i);

		for (int k = i; k < nums.length; k++) {
			nums[k] = 0;
		}
		System.out.println();

		for (int x : nums) {
			System.out.printf("%d, ", x);
		}
		return i;
	}

	public static void main(String[] args) {
//		int[] nums = { 1, 1, 2 };
//		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] nums = { 1, 2 };
		removeDuplicates(nums);
	}
}
