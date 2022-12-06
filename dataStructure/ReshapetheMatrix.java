package problems.dataStructure;

import java.util.Arrays;

public class ReshapetheMatrix {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int result[][] = new int[r][c];
		
		int rows = mat.length;
		int cols = mat[0].length;
		
		if(rows * cols != r * c)
			return mat;
		
		int newRow = 0, newCol = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				result[newRow][newCol] = mat[i][j];
				newCol++;
				
				if(newCol == c) {
					newCol = 0;
					newRow++;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2 }, { 3, 4 } };
		int r = 2, c = 4;

		System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
	}

}
