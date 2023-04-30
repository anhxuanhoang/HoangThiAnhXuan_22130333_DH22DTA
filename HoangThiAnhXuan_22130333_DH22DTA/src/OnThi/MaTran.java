package OnThi;
public class MaTran {
	//In ra 1 ma tran
	public static void main(String[] args) {
		int [][] matrix1= {{1,2,3},{2,3,4},{4,5,6}};
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
