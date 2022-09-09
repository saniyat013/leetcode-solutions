package problems.theLeetCodeBeginnersGuide;

public class RunningSumof1dArray {
	public static int[] runningSum(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			result[i] = nums[i] + result[i - 1];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 10, 1 };
		int[] result = runningSum(nums);
		for (int n : result) {
			System.out.print(n + ", ");
		}

	}
}
