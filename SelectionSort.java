
public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 14, 33, 27, 35, 10 };
		int t;
		for (int i = 0; i < 4; i++) {
			int min = i;
			for (int j = i + 1; j < 5; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			t = a[i];
			a[i] = a[min];
			a[min] = t;
		}
		System.out.print("sorting :");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
