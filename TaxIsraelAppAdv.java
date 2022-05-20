/*
 10%: up to 6450
 14%: 6451 up to 9240
 20%: 9241 up to 14840
 31%: 14841 up to 20620
 35%: 20621 up to 42910
 47%: from all shekel above
 */

public class TaxIsraelAppAdv {

	public static void main(String[] args) {
		double tax = calcTaxIsrael(8450, 0);
		System.out.println(tax);
	}

	public static double calcTaxIsrael(double salary, double points) {

		// Arrays of salary and tax rate
		int[] salaryRate = { 6450, 9240, 14840, 20620, 42910 };
		double[] taxRate = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47 };

		// Nekudot zikui
		double pointsInShekel = 223 * points;

		// Calculate amount of tax for each rate
		double tax10 = 6450 * taxRate[0];
		double tax14 = (salary - 6450) * taxRate[1];
		double tax20 = (salary - 9240) * taxRate[2];
		double tax31 = (salary - 14840) * taxRate[3];
		double tax35 = (salary - 20620) * taxRate[4];
		double tax47 = (salary - 42910) * taxRate[5];

		if (salary < salaryRate[0]) {
			return salary * 0.1 - pointsInShekel;
		} else if (salary >= salaryRate[0] && salary < salaryRate[1]) {
			return tax10 + tax14 - pointsInShekel;
		} else if (salary >= salaryRate[1] && salary < salaryRate[2]) {
			return tax10 + tax14 + tax20 - pointsInShekel;
		} else if (salary >= salaryRate[2] && salary < salaryRate[3]) {
			return tax10 + tax14 + tax20 + tax31 - pointsInShekel;
		} else if (salary >= salaryRate[3] && salary < salaryRate[4]) {
			return tax10 + tax14 + tax20 + tax31 + tax35 - pointsInShekel;
		} else {
			return tax10 + tax14 + tax20 + tax31 + tax35 + tax47 - pointsInShekel;
		}
	}
}
