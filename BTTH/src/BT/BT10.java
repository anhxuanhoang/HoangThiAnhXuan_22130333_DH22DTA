package BT;

public class BT10 {
	public static int[] sort (int []array) {
		for (int i=0; i<array.length -1; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i] < array[j]) {
					swap (array[i], array[j]);
					int tmp = array[i];
					array[i] = array[j];
					array[j]= tmp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int array [] = {1,2,3,8,7,9,5};
		sort(array);
		print(array);
	}
		
	public static void print (int array[]) {
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
			
	
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
