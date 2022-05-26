package problems.datastructure;

public class BestTimetoBuyandSellStock {
	public static int maxProfit(int[] prices) {
		int leastPrice = Integer.MAX_VALUE;
		int profit = 0;
		int todaysProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (leastPrice > prices[i]) {
				leastPrice = prices[i];
			}

			todaysProfit = prices[i] - leastPrice;

			if (profit < todaysProfit) {
				profit = todaysProfit;
			}
		}

		return profit;
	}

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };

		System.out.println(maxProfit(prices));
	}

}
