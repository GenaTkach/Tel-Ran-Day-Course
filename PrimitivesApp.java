package telran.primitives.controller;

public class PrimitivesApp {

	public static void main(String[] args) {
		if(args.length == 0) {
			displayAllValues();
		}
		minMaxValues(args);
	}
	
	public static void minMaxValues(String[] args) {
		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
			case "byte":
				System.out.println("Min. value of Byte : " + Byte.MIN_VALUE + ", Max. value of Byte : " + Byte.MAX_VALUE);
				break;
			case "short":
				System.out.println("Min. value of Short : " + Short.MIN_VALUE + ", Max. value of Short : " + Short.MAX_VALUE);
				break;
			case "char":
				System.out.println("Min. value of Char : " + Character.MIN_VALUE + ", Max. value of Char : " + Character.MAX_VALUE);
				break;
			case "int":
				System.out.println("Min. value of Int : " + Integer.MIN_VALUE + ", Max. value of Int : " + Integer.MAX_VALUE);
				break;
			case "long":
				System.out.println("Min. value of Long : " + Long.MIN_VALUE + ", Max. value of Long : " + Long.MAX_VALUE);
				break;
			case "float":
				System.out.println("Min. value of Float : " + Float.MIN_VALUE + ", Max. value of Float : " + Float.MAX_VALUE);
				break;
			case "double":
				System.out.println("Min. value of Double : " + Double.MIN_VALUE + ", Max. value of Double : " + Double.MAX_VALUE);
				break;
			default:
				System.out.println("Wrong type of argument num : " + i + " (" + args[i] + ")");
				break;
			}
		}
	}
	
	public static void displayAllValues() {
		System.out.println("Min. value of Byte : " + Byte.MIN_VALUE + ", Max. value of Byte : " + Byte.MAX_VALUE);
		System.out.println("Min. value of Short : " + Short.MIN_VALUE + ", Max. value of Short : " + Short.MAX_VALUE);
		System.out.println("Min. value of Char : " + Character.MIN_VALUE + ", Max. value of Char : " + Character.MAX_VALUE);
		System.out.println("Min. value of Int : " + Integer.MIN_VALUE + ", Max. value of Int : " + Integer.MAX_VALUE);
		System.out.println("Min. value of Long : " + Long.MIN_VALUE + ", Max. value of Long : " + Long.MAX_VALUE);
		System.out.println("Min. value of Float : " + Float.MIN_VALUE + ", Max. value of Float : " + Float.MAX_VALUE);
		System.out.println("Min. value of Double : " + Double.MIN_VALUE + ", Max. value of Double : " + Double.MAX_VALUE);
	}
}
