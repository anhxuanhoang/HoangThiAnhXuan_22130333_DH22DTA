package OnThi;

public class CheoPhu {

	public static boolean isSymmetric(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if (arr[i][j] != arr[i][n-i-1]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int sumDiagonal(int[][] matrix) {
		int sumDiagonal = 0;
		for (int i = 0; i < matrix.length; i++) {
			sumDiagonal += matrix[i][matrix.length - 1 - i];
		}
		return sumDiagonal;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 3, 6, 7 } };
		System.out.println("Tong: " + sumDiagonal(arr));

		if (isSymmetric(arr)) {
			System.out.println("Ma tran doi xung qua duong cheo phu");
		} else
			System.out.println("Ma tran khong doi xung qua duong cheo phu");

	}

}
