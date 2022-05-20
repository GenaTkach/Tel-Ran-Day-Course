
public class ArrayAdv {

	public static void main(String[] args) {
		int[] arr = new int[10];
		printArray(arr);
		fillArray(arr, 0, 99);
		printArray(arr);

		int res = sumArray(arr);
		System.out.println("Sum = " + res);

		double avg = calcAvg(arr);
		System.out.println("Avg = " + avg);

		int max = max(arr);
		System.out.println("Max = " + max);

		int search = search(arr, 2);
		System.out.println("Index = " + search);

		// HomeWork
		int min = min(arr);
		System.out.println("Min = " + min);

		int minIndex = minIndex(arr);
		System.out.println("Index of min number = " + minIndex);
		
		reverseArray(arr);
		printArray(arr);
	}

	private static void reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	private static int minIndex(int[] arr) {
		int indexOfMin = 0;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				indexOfMin = i;
				min = arr[i];
			}
		}
		return indexOfMin;
	}

	private static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int sumArray(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter += arr[i];
		}
		return counter;
	}

	public static double calcAvg(int[] arr) {
		return (double) sumArray(arr) / arr.length;
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

	public static int search(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
