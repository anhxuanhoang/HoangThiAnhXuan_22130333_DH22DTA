package BT;

public class BT6 {

	public static void printMatrix(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] createPascalTriagle(int size) {
		int[][] result = new int[size][];

		for (int row = 0; row < result.length; row++) {
			result[row] = new int[row + 1];

			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = col + 1;
			}
		}
		return result;
	}

	public static int[][] createPascalTriangle(int[] array) {
		if (array.length < 0 || array == null)
			return null;
		int[][] result = new int[array.length][];
		for (int row = 0; row < array.length; row++) {
			result[row] = new int[row + 1];
			result[row][row] = array[row];
			for (int col = result[row].length - 1; col >= 1; col--) {
				result[row][col - 1] = result[row][col] - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 0 };
		// printMatrix(createPascalTriangle(arr));
		printMatrix(createPascalTriagle(5));
	}
}