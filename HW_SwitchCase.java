
public class HW_SwitchCase {

	public static void main(String[] args) {
		leumi(2);
		scheduler(6);
	}

	public static void leumi(int day) {
		switch (day) {
		case 1:
			System.out.println("8:30 - 13:30");
			break;
		case 2:
			System.out.println("8:30 - 13:00 and 16:00 - 18:00");
			break;
		case 3:
			System.out.println("8:30 - 13:30");
			break;
		case 4:
			System.out.println("8:30 - 13:00 and 16:00 - 18:00");
			break;
		case 5:
			System.out.println("8:30 - 13:30");
			break;
		case 6:
			System.out.println("Closed");
			break;
		case 7:
			System.out.println("Closed");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

	public static void scheduler(int week) {
		// Check input
		if (week <= 0 || week > 52) {
			System.out.println("Wrong number of week");
			return;
		}

		int groupNumber = week % 4;
		switch (groupNumber) {
		case 1:
			System.out.println("Dan");
			break;
		case 2:
			System.out.println("Yuval");
			break;
		case 3:
			System.out.println("Keren");
			break;
		case 0:
			System.out.println("Yaron");
			break;
		default:
			break;
		}

	}
}
