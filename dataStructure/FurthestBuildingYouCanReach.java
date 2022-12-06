package problems.dataStructure;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < heights.length - 1; i++) {
			int gap = heights[i + 1] - heights[i];

			if (gap > 0) {
				queue.add(gap);
			}

			if (queue.size() > ladders) {
				bricks -= queue.poll();
			}

			if (bricks < 0) {
				return i;
			}
		}
		return heights.length - 1;
	}

	public static void main(String[] args) {
		int heights[] = { 4, 2, 7, 6, 9, 14, 12 };
		int bricks = 5;
		int ladders = 1;

		System.out.println("RESULT: " + furthestBuilding(heights, bricks, ladders));
	}

}
