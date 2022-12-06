package problems.arrays101;

import java.util.Arrays;

public class HeightChecker {
	public static int heightChecker(int[] heights) {
//		Using library function
		int[] temp = heights.clone();
		Arrays.sort(temp);

		int count = 0;
		for (int i = 0; i < heights.length; i++) {
//			System.out.println(heights[i]);
//			System.out.println(temp[i]);
			if (heights[i] != temp[i])
				count++;
		}
		return count;
	}
	
//	Without Sorting
//	public int heightChecker(int[] heights) {
//        int[] heightToFreq = new int[101];
//        
//        for (int height : heights) {
//            heightToFreq[height]++;
//        }
//        
//        int result = 0;
//        int curHeight = 0;
//        
//        for (int i = 0; i < heights.length; i++) {
//            while (heightToFreq[curHeight] == 0) {
//                curHeight++;
//            }
//            
//            if (curHeight != heights[i]) {
//                result++;
//            }
//            heightToFreq[curHeight]--;
//        }
//        
//        return result;
//    }

	public static void main(String[] args) {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(heightChecker(heights));
	}

}
