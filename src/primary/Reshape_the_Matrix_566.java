package primary;

import java.util.Stack;

public class Reshape_the_Matrix_566 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2 }, { 3, 5 }, { 4, 3 } };

		int[][] newArr = matrixReshape(arr, 1, 6);
		
		

	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int oriR = nums.length;
		int oriC = nums[0].length;

		Stack<Integer> stack = new Stack<>();

		if (oriR * oriC != r * c) {
			return nums;

		}

		int[][] result = new int[r][c];

		for (int i = 0; i < oriR; i++) {
			for (int j = 0; j < oriC; j++) {
				stack.push(nums[i][j]);
			}
		}

		for (int i = r - 1; i >= 0; i--) {
			for (int j = c - 1; j >= 0; j--) {
				result[i][j] = stack.pop();
			}
		}

		return result;
	}

}
