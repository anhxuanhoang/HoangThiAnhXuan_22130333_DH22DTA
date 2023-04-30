package OnThi;

public class CheoChinh {

	public static boolean isSymmetric(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int sum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 7, 3 }, { 7, 4, 5 }, { 3, 5, 6 } };

		System.out.println("Tong: " + sum(arr1));

		if (isSymmetric(arr1)) {
			System.out.println("Ma tran doi xung qua duong cheo chinh");
		} else
			System.out.println("Ma tran khong doi xung qua duong cheo chinh");

	}

}
