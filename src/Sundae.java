public class Sundae extends IceCream {

	String toppingName;
	double toppingPrice;

	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0.00;

	}

	public Sundae(String n, int sC, double pPS, String tN, double tP) {
		super(n, sC, pPS);
		toppingName = tN;
		toppingPrice = tP;

	}

	public String getToppingName() {
		return toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingName(String tN) {
		toppingName = tN;
	}

	public void setToppingPrice(double tP) {
		toppingPrice = tP;
	}

	public double calculateCost() {
		double totals = super.calculateCost() + toppingPrice;
		return totals;
	}

	public String toString() {
		String line1 = String.format("\n%-25s", super.getName());
		String line2Pt1 = String.format("%-2sscoops of %-2s ice cream @ $%-3s/scoop \n\t%-2s Topping @ $%-24s",
				super.getScoopCount(), super.getName(), super.getPricePerScoop(), toppingName, toppingPrice);
		String line2Pt2 = String.format("$%-2.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]\n", super.calculateTax());
		String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
		return outputVar;
	}

}
