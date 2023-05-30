
public class Candy extends DessertItem {

	double candyWeight;
	double pricePerPound;

	public Candy() {
		super();
		candyWeight = 0;
		pricePerPound = 0.0;
	}

	public double orderCost() {
		calculateCost();
		return candyWeight;
	}

	/*
	 * a new method, calculateCost(), which will override the superclass's method
	 * and return the correct cost for the item
	 * Note: The cost of a Sundae is the cost of the ice cream used plus the cost of
	 * the topping
	 */
	public Candy(String n, double w, double p) {
		super(n);
		candyWeight = w;
		pricePerPound = p;

	}

	public double getCandyWeight() {
		return candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setCandyWeight(double w) {
		candyWeight = w;
	}

	public void setPricePerPound(double p) {
		pricePerPound = p;
	}

	public double calculateCost() {
		double candyCost = pricePerPound * candyWeight;
		return candyCost;

	}

	public String toString() {
		String line1 = String.format("\n%-25s", super.getName());
		String line2Pt1 = String.format("%-4slbs. @ $%-4.2f/lb", candyWeight, pricePerPound);
		String line2Pt2 = String.format("$%-6.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]\n", super.calculateTax());
		String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
		return outputVar;
	}

}
