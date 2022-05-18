
public class HW_NestedLoops {

	public static void main(String[] args) {
		figure2(7);
	}

	public static void figure1(int height) {
		for (int i = 0; i < height; i++) {
			for (int j = height; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void figure2(int row) {
		for (int i = 0; i < row; i++) {
			int k = i;
			for (int j = row; j > i; j--) {
				//Put space for first row
				System.out.print(" ");
				//Put spaces for other rows
				while (k > 0) {
					System.out.print(" ");
					k--;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
