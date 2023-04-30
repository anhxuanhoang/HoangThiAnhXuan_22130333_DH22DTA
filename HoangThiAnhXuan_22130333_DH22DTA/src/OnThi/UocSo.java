package OnThi;

public class UocSo {
	// Xem co bao nhieu uoc so 
	public static int diem_Uocso(int number) {
		int dem = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				dem++;
		}
		return dem;
	}

	public static void main(String[] args) {
		System.out.println(diem_Uocso(5));
	}

}
