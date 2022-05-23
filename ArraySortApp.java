
public class ArraySortApp {
	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, 10, 99);
		printArray(arr);
		int binary = binarySearch(arr, 42);
		System.out.println("Index = " + binary);

		selectionSort(arr);
		printArray(arr);
	}

	// Homework - selection sort
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			int index = indexOfMin(arr, i);
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}

	private static int indexOfMin(int[] arr, int index) {
		int indexOfMin = index;
		for (int i = index + 1; i < arr.length; i++) {
			if (arr[i] < arr[indexOfMin] && i > index) {
				indexOfMin = i;
			}
		}
		return indexOfMin;
	}

	private static int binarySearch(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == value) {
				return mid;
			} else if (value < arr[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -l - 1;
	}

	private static void fillArray(int[] arr, int min, int max) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random() * (max - min + 1));
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static void bubbleSort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			while (bubbling(arr))
				;
		}
	}

	private static boolean bubbling(int[] arr) {
		boolean res = false;
		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				res = true;
			}
		}
		return res;
	}
}
