import java.util.ArrayList;

public class Order extends DessertShop{
	//attributes
	
	private ArrayList<DessertItem> OrderArray;


	//Constructor
	public Order() {
		OrderArray = new ArrayList<>();
	}
	
	
	//methods
	public ArrayList<DessertItem> getOrderList(){
		
		return OrderArray;
		
	}// end of getOrderList
	public ArrayList<DessertItem> Add(DessertItem addDesert){
		OrderArray.add(addDesert);
		return OrderArray;
	}// end of Add
	public int itemCount(){
		int counted = OrderArray.size();
		return counted;
	}//end of itemCount
	public double orderCost() {
		double orderResult = 0;
		for(int i=0; i<OrderArray.size(); i++) {
			orderResult = orderResult + OrderArray.get(i).calculateCost();
		}
		return orderResult;
	}
	public double orderTax() {
		double taxResult = 0;
		for(int i = 0; i<OrderArray.size(); i++) {
			taxResult = taxResult + OrderArray.get(i).calculateTax();
		}
		return taxResult;
	}
	public double orderTotal() {
		double ordertotal = orderTax() + orderCost();
		return ordertotal;
	}
	
	public String toString() {
		
		String finalOutput = "";
		finalOutput += "------------------------Receipt--------------------------\n";
		for(int i = 0; i < OrderArray.size(); i++) {
			finalOutput = finalOutput + OrderArray.get(i).toString();
		}
		finalOutput += "--------------------------------------------------\n";

		String line2 = "Total Number of items in order: " + itemCount() + "\n";
		String line3 = String.format("Order Subtotals:\t\t\t\t $%-6.2f", orderCost());
		String line4 = String.format("[Tax: $%.2f]\n", orderTax());
		String line5 = String.format("\nOrder Total:\t\t\t\t\t $%-6.2f\n", orderTotal());
		String outputVar = String.format("%s\n%s%s%17s", line2, line3, line4, line5);
		String ending = "----------------------------------------------------";
		return finalOutput + outputVar + ending;
	}
	
}
