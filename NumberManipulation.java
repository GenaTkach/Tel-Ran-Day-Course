
public class NumberManipulation {

	public static void main(String[] args) {
		int res = countDigits(123);
		System.out.println("Count digits = " + res);//3
		res = countDigits(8);
		System.out.println("Count digits = " + res);//1
		res = countDigits(0);
		System.out.println("Count digits = " + res);//1
		luckyNumber(173854);// 1 + 3 + 5 != 7 + 8 + 4 - unlucky
		luckyNumber(1738649);// 1 + 3 + 6 + 9 == 7 + 8 + 4 - lucky
		luckyNumber(1234860);// 1 + 3 + 8 + 0 == 2 + 4 + 8 - lucky
	}
	
	public static void luckyNumber(int num) {
		//int i - for odd and even
		int i = 1;
		int counter = 0;
		
		while (num != 0) {
			if (i % 2 != 0) {
				int digit = num % 10;
				counter += digit;
				num /= 10;
				i++;
			}
			else {
				int digit = num % 10;
				counter -= digit;
				num /= 10;
				i++;
			}
		}

		if (counter == 0) {
			System.out.println("Lucky");
		}
		else {
			System.out.println("Unlucky");
		}
	}
	
	public static int countDigits(int num) {
		int counter = 1;
		num /= 10;
		while(num != 0) {
			num /= 10;
			counter ++;
		}
		return counter;
	}
	
}
