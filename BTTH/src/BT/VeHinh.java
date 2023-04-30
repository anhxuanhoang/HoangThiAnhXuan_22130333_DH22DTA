package BT;

public class VeHinh {
	public static String[][] veHinh(int n) {
		if (n < 0)
			return null;
		String[][] result = new String[n][];
		for (int i = 0; i < n; i++) {
			result[i] = new String[n];
			for (int j = 0; j < result[i].length; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					result[i][j] = "*";
				}else {
					result[i][j] = " ";
				}
			}
		}
		return result;
	}

	public static void printMatrix(String[][] matrix) {
		if (matrix == null)
			return;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printMatrix(veHinh(7));
		;
	}
}