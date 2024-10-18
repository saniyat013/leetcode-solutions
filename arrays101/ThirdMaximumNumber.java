package com.saniyat.problemSolving.leetcodeSolutions.arrays101;

import java.util.Arrays;
import java.util.Collections;

public class ThirdMaximumNumber {
//	Using library functions
	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		int index = nums.length - 1;
		if (nums.length >= 3) {
			int count = 1;
			
			while (index >= 1) {
				if(count == 3) break;
				if(nums[index - 1]!= nums[index]) {
					count++;
				}
				index--;
			}
		}

		System.out.println("this returned" + index);
		return nums[index];

	}

	public static void main(String[] args) {
//		int[] nums = { 3,2, 2,1 };
//		int[] nums = { 2,1 };
//		int[] nums = { 3,2, 1 };
//		int[] nums = { 2,2,3, 1 };
				int[] nums = { -2147483648,1,1 };
		
		System.out.println(thirdMax(nums));	
	}

}
