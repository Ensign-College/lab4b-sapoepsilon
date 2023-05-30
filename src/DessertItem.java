

abstract class DessertItem {
	// Attributes
	private double taxPercent = 7.25;
	private String name;

	// Constructors
	public DessertItem() {

		name = "";

	}

	// Constructors
	public DessertItem(String n) {

		name = n;

	}
	// Getters and Setters

	public double getTaxPercent() {
		return taxPercent;
	}

	public String getName() {

		return name;

	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;

	}

	public void setName(String name) {

		this.name = name;
	}

	public double calculateTax() {

		double tax = (calculateCost() / 100) * 7.25;
		return tax;

	}

	public abstract double calculateCost();
}
