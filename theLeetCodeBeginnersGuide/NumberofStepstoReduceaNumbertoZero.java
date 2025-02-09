package com.saniyat.problemSolving.leetcodeSolutions.theLeetCodeBeginnersGuide;

public class NumberofStepstoReduceaNumbertoZero {
	public static int numberOfSteps(int num) {
		int count = 0;

		while (num > 0) {
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num--;
			}
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		int num = 123;

		System.out.println(numberOfSteps(num));
	}
}
