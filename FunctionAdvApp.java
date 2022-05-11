
public class FunctionAdvApp {

	public static void main(String[] args) {
		System.out.println(max(50, 5));
		System.out.println(abs(-10));
		System.out.println(min(-10,-1));
	}
	
	public static double max(double x, double y) {
		return x > y ? x : y;
	}
	
	public static double abs(double x) {
		return x >= 0 ? x : -x;
	}
	
	//Homework done
	public static double min(int x, int y) {
		double check = max(-x,-y);
		return check < 0 ? abs(check) : -check;
	}
	
}
