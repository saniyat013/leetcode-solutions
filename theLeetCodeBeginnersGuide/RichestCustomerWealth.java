package com.saniyat.problemSolving.leetcodeSolutions.theLeetCodeBeginnersGuide;

public class RichestCustomerWealth {
	public static int maximumWealth(int[][] accounts) {
		int maxWealth = 0, sum = 0;

//		for (int i = 0; i < accounts.length; i++) {
//			sum = 0;
//			for (int j = 0; j < accounts[i].length; j++) {
//				sum += accounts[i][j];
//			}
//			maxWealth = Math.max(maxWealth, sum);
//		}

		for (int[] customer : accounts) {
			sum = 0;
			for (int bank : customer) {
				sum += bank;
			}
			maxWealth = Math.max(maxWealth, sum);
		}

		return maxWealth;
	}

	public static void main(String[] args) {
		int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
		System.out.println(maximumWealth(accounts));
	}
}
