package OnThi;

import java.util.Iterator;

public class ViDu {
	// Tính tổng từng dòng của ma trận

//	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		int row = arr.length;
//		int col = arr.length;
//		int[] rowSum = new int[row];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				rowSum[i] += arr[i][j];
//			}
//
//		}
//		for (int i = 0; i < row; i++) {
//			System.out.println("Tong: " + rowSum[i]);
//		}
//	}
	public static void printMatrix (int [][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
//}
	public static boolean isSymmetric(int[][] arr) {
		int  n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] != arr[n-i-1]) {
				return false;
			}	
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 3, 6, 7 } };
		if (isSymmetric(arr)) {
			System.out.println("DOI XUNG");
		}else {
			System.out.println("Khong Doi Xung");
		}
//		printMatrix(isSymmetric(arr));
	}
	
	}