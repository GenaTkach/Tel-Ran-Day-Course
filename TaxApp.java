
public class TaxApp {

	public static void main(String[] args) {
		double x = calcTax(2000);
		System.out.println("Tax amount: " + x + " USD.");
	}

	public static double calcTax(double salary) {
		if (salary > 1000) {
			double tax = (salary - 1000) * .17;
			return tax;
		} else {
			return 0;
		}
	}
}
