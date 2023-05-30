
public class IceCream extends DessertItem {
	int scoopCount;
	double pricePerScoop;

	public IceCream() {

	}

	public IceCream(String n, int sC, double pPS) {
		super(n);
		scoopCount = sC;
		pricePerScoop = pPS;

	}

	public int getScoopCount() {
		return scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setScoopCount(int sC) {
		scoopCount = sC;
	}

	public void setPricePerScoop(double pPS) {
		pricePerScoop = pPS;
	}

	public double calculateCost() {
		double costIceCream = pricePerScoop * scoopCount;
		return costIceCream;
	}

	public String toString() {
		String line1 = String.format("\n%-25s", super.getName());
		String line2Pt1 = String.format("%-2s Scoops @ $%-4s/scoop:", scoopCount, pricePerScoop);
		String line2Pt2 = String.format("$%-6.2f", calculateCost());
		String line2Pt3 = String.format("[Tax: $%.2f]\n", super.calculateTax());
		String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
		return outputVar;
	}
}
