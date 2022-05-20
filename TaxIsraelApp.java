/*
 10%: up to 6450
 14%: 6451 up to 9240
 20%: 9241 up to 14840
 31%: 14841 up to 20620
 35%: 20621 up to 42910
 47%: from all shekel above
 */
public class TaxIsraelApp {

	public static void main(String[] args) {
		double tax = calcTaxIsrael(5500, 2);
		System.out.println(tax);

	}

	public static double calcTaxIsrael(double salary, double points) {

		double pointsInShekel = 219 * points;

		double tax10 = 6450 * 0.1;
		double tax14 = (salary - 6450) * 0.14;
		double tax20 = (salary - 9240) * 0.2;
		double tax31 = (salary - 14840) * 0.31;
		double tax35 = (salary - 20620) * 0.35;
		double tax47 = (salary - 42910) * 0.47;

		if (salary < 6450) {
			return salary * 0.1 - pointsInShekel;
		} 
		else if (salary > 6450 && salary < 9241) {
			return tax10 + tax14 - pointsInShekel;
		} 
		else if (salary >= 9241 && salary < 14841) {
			return tax10 + tax14 + tax20 - pointsInShekel;
		} 
		else if (salary >= 14841 && salary < 20621) {
			return tax10 + tax14 + tax20 + tax31 - pointsInShekel;
		} 
		else if (salary >= 20621 && salary < 42911) {
			return tax10 + tax14 + tax20 + tax31 - pointsInShekel;
		}
		else {
			return tax10 + tax14 + tax20 + tax31 + tax47 - pointsInShekel;
		}
	}
}
