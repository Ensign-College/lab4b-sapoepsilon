

public class Cookie extends DessertItem {
	int cookieQty;
	double pricePerDozen;

	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0;
	}

	/*
	 * a new method, calculateCost(), which will override the superclass's method
	 * and return the correct cost for the item
	 * Note: The cost of a Sundae is the cost of the ice cream used plus the cost of
	 * the topping
	 */
	public Cookie(String n, int q, double p) {
		super(n);
		cookieQty = q;
		pricePerDozen = p;

	}

	public int getCookieQty() {
		return cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public void setCookieQty(int q) {
		cookieQty = q;
	}

	public void setToppingPricePricePerDozen(double p) {
		pricePerDozen = p;
	}

	@Override
	public double calculateCost() {
		double cookieCost = cookieQty * (pricePerDozen / 12);
		return cookieCost;

	}

	public String toString() {
		String line1 = String.format("\n%-25s", super.getName());
		String line2Pt1 = String.format("%-2s cookies @ $%-4.2f/dozen:", cookieQty, pricePerDozen);
		String line2Pt2 = String.format("$%-6.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%4.2f]\n", super.calculateTax());
		String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
		return outputVar;
	}

}
