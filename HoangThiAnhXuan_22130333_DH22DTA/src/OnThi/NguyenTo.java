package OnThi;
public class NguyenTo {
	//Xem co phai la so nguyen to khong
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;
		if (number >= 2) {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(10));
	}
}
