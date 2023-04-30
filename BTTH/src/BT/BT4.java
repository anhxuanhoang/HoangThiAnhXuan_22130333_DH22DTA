package BT;

public class BT4 {
	public static int[] arrayPlus(int[] arr1, int[] arr2) {

		int[] result = null;
		if (arr1.length >= arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				arr1[i] += arr2[i];
			}
			result = arr1;
		} else {
			if (arr2.length >= arr1.length) {
				for (int i = 0; i < arr1.length; i++) {
					arr2[i] += arr1[i];
				}
				result = arr2;
			}
		}
		return result;
	}

	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 9, 8, 7, 0 };
		int[] arr2 = { 4, 6, 3, 8 };
		display(arrayPlus(arr1, arr2));
		;

	}
}
