package problems.arrays101;

public class ReplaceElementswithGreatestElementonRightSide {
	public static int[] replaceElements(int[] arr) {
		int len = arr.length;

		if (len == 0)
			return arr;

		int temp, max;

		max = arr[len - 1];

		for (int i = len - 2; i >= 0; i--) {
			temp = arr[i];
			arr[i] = max;
			max = Math.max(max, temp);
		}

		arr[len - 1] = -1;

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };

		int[] result = replaceElements(arr);
		for (int x : result) {
			System.out.print(x + ", ");
		}
	}
}
