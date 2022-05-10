
public class FunctionAdvApp {

	public static void main(String[] args) {
		System.out.println(max(50, 5));
		System.out.println(abs(-10));
		System.out.println(min(50,6));
	}
	
	public static double max(double x, double y) {
		return x > y ? x : y;
	}
	
	public static double abs(double x) {
		return x >= 0 ? x : -x;
	}
	
	//Homework done
	public static double min(double x, double y) {
		return abs(max(-x,-y));
	}
	
}
