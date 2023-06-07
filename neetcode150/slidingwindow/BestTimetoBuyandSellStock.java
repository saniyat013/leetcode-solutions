package problems.neetcode150.slidingwindow;

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		int left = 0, right = 1;
		int profit = 0, maxProfit = 0;

		while (right < prices.length) {
			if (prices[left] < prices[right]) {
				profit = prices[right] - prices[left];
				maxProfit = Math.max(maxProfit, profit);
			} else {
				left = right;
			}
			right++;
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}

}
