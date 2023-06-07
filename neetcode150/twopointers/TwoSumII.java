package problems.neetcode150.twopointers;

import java.util.Arrays;

public class TwoSumII {
//	Very Primitive Bruteforce solution, takes a lot of time
//	public static int[] twoSum(int[] numbers, int target) {
//		int result[] = new int[2];
//
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				System.out.println(i + " " + numbers[i] + ", " + j + " " + numbers[j]);
//				if (numbers[i] + numbers[j] > target) {
//					break;
//				}
//
//				if (numbers[i] + numbers[j] == target) {
//					result[0] = i + 1;
//					result[1] = j + 1;
//					return result;
//				}
//			}
//		}
//
//		return result;
//	}

//	Using 2 pointer
	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (start < end) {
			if (numbers[start] + numbers[end] > target)
				end--;

			else if (numbers[start] + numbers[end] < target)
				start++;
			else
				break;
		}

		return new int[] { start + 1, end + 1 };
	}

	public static void main(String[] args) {
		int numbers[] = { 1, 3, 4, 5, 7, 10, 11 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

}
