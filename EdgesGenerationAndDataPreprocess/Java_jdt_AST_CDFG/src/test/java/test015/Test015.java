package test015;

public class Test015 {
	
	public static void main(String[] args) {

		int[] array = { 5, 4, 2, 3, 8, 7, 1, 0, 6, 9 };

		System.out.print("before sorting: ");
		arrayPrintln(array);

		quickSort(array, 0, array.length - 1);

		System.out.print("after sorting: ");
		arrayPrintln(array);
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left <= right) {
			int p = array[(left + right) / 2];
			int l = left;
			int r = right;

			while (l <= r) {
				while (array[l] < p) {
					l++;
				}
				while (array[r] > p) {
					r--;
				}

				if (l <= r) {
					int tmp = array[l];
					array[l] = array[r];
					array[r] = tmp;
					l++;
					r--;
				}
			}

			quickSort(array, left, r);
			quickSort(array, l, right);
		}
	}

	public static void arrayPrintln(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
