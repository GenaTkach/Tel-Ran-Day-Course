//How many functions are called by main? - 3
//Which functions are not called? - 3,4,5
//Which functions do not call any other functions? - 3,6
public class StackAppHomeWork {

	public static void main(String[] args) {
		System.out.println("Main starts");
		function6();
		System.out.println("Back to Main");
		function1();
		System.out.println("Back to Main");
		function2();
		System.out.println("Main ends");
	}

	private static void function2() {
		System.out.println("Function2 starts");
		function6();
		System.out.println("Function2 ends");
	}

	private static void function1() {
		System.out.println("Function1 starts");
		function4();
		System.out.println("Function1 ends");
	}

	private static void function4() {
		System.out.println("Function4 starts");
		function5();
		System.out.println("Function4 ends");
	}

	private static void function5() {
		System.out.println("Function5 starts");
		function6();
		System.out.println("Function5 ends");
	}

	private static void function6() {
		System.out.println("Function6 starts");
		System.out.println("Function6 ends");
	}
}
