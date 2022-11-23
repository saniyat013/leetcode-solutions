package problems.arrays101;

import java.util.HashSet;

public class CheckIfNandItsDoubleExist {
	public static boolean checkIfExist(int[] arr) {
		HashSet<Integer> mySet = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (mySet.contains(arr[i] * 2) || (mySet.contains(arr[i] / 2) && arr[i] % 2 == 0)) {
				return true;
			}
			mySet.add(arr[i]);
		}

		return false;
	}

	public static void main(String[] args) {
//		int[] arr = { 5, 10, 2, 3 };
		int[] arr = { 5, 0, 10, -19, 4, 6, -8 };
		System.out.println(checkIfExist(arr));
	}
}
