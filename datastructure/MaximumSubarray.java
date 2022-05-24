package problems.datastructure;

public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		int max_sum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int x : nums) {
			currentSum += x;
            
            if (max_sum < currentSum)
				max_sum = currentSum;
			
			if (currentSum < 0)
				currentSum = 0;
		}

		return max_sum;
	}

	public static void main(String args[]) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
}
