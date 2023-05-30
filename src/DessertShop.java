/*Name: Ismatulla Mansurov
 * Date: 10/13/2020
 * Instructor: Jeffrey Light
 * Project: User Interface using toString();
 */


import java.util.Scanner;

public class DessertShop {

	private static DessertItem userPromptCandy() {
		Scanner scan = new Scanner(System.in);
		boolean valid = false;
		String inputCandyType;
		int quantityPurchased = 0;
		double pricePerPound = 0;


			System.out.println("Please enter the type of Candy:");
			inputCandyType = scan.nextLine();
		

		while(!valid) {
			valid = true;
			try {
				System.out.println("Please enter the quantity purchased: ");
				quantityPurchased = scan.nextInt();
				break;

			} catch (Exception e) {
			valid=false;
			scan.nextLine();
			}

		}
		valid=false;
		while(!valid) {
			valid=true;
			try {
				System.out.println("Please enter the price per pound: ");
				pricePerPound = scan.nextDouble();
				break;

			} catch (Exception e) {
				valid=false;
				scan.nextLine();
			}
		}

		DessertItem candy = new Candy(inputCandyType, quantityPurchased, pricePerPound);
		return candy;


	}// end of userPromptCandy()

	private static DessertItem userPromptCookie() {

		Scanner scan = new Scanner(System.in);

		String inputCookieType = "";
		boolean valid = false;
		int cookieQty = 0;
		double pricePerDozen = 0;

			System.out.println("Please enter the type of Cookie:");
			inputCookieType = scan.nextLine();

		while (!valid) {

			try {

				System.out.println("Please enter the quantity purchased: ");
				cookieQty = scan.nextInt();
				break;

			} catch (Exception e) {
				valid = false;
				scan.nextLine();
			}

		}
		valid=false;

		while (!valid) {
			
			try {
				System.out.println("Please enter the price per Dozen: ");
				pricePerDozen = scan.nextDouble();
				break;

			} catch (Exception e) {
				valid = false;
				scan.nextLine();
			}
		}

		DessertItem cookie = new Cookie(inputCookieType, cookieQty, pricePerDozen);

		return cookie;
	}// end of userPromptCookie()

	private static DessertItem userPromptIceCream() {

		Scanner scan = new Scanner(System.in);
		boolean valid = false;
		String inputIceCreamType = "";
		int scoopAmount = 0;
		double pricePerScoop = 0;

			System.out.println("Please enter the type of IceCream:");
			inputIceCreamType = scan.nextLine();

		while (!valid) {
			valid = true;
			try {

				System.out.println("Please enter the quantity purchased: ");
				scoopAmount = scan.nextInt();
				break;

			} catch (Exception e) {
				valid = false;
				scan.nextLine();
			}

		}
		valid=false;

		while (!valid) {
				valid = true;
			try {
				System.out.println("Please enter the price per Scoop: ");
				pricePerScoop = scan.nextDouble();
				break;

			} catch (Exception e) {
				valid = false;
				scan.nextLine();
			}

		}

		DessertItem iceCream = new IceCream(inputIceCreamType, scoopAmount, pricePerScoop);
		return iceCream;
	}// end of userPromptIceCream()

	private static DessertItem userPromptSundae() {

		Scanner scan = new Scanner(System.in);
		boolean valid = false;
		String inputIceCreamType = "";
		String inputSundaeType = "";
		double toppingPrice = 0;
		int scoopAmount = 0;
		double pricePerScoop = 0;

			System.out.println("Please enter the type of IceCream:");
			inputIceCreamType = scan.nextLine();

		while (!valid) {
			valid = true;
			try {

				System.out.println("Please enter the quantity purchased: ");
				scoopAmount = scan.nextInt();
				break;

			} catch (Exception e) {
				valid = false;
				scan.nextLine();
			}

		}
		valid= false;

		while (!valid) {

			try {
				System.out.println("Please enter the price per Scoop: ");
				pricePerScoop = scan.nextDouble();
				break;

			} catch (Exception e) {
				valid=false;
				scan.nextLine();
			}

		}

		System.out.println("Please enter the type of Sundae:");
		inputSundaeType = scan.nextLine();

		while (!valid) {
			
			try {
				System.out.println("Please enter the price per Scoop: ");
				toppingPrice = scan.nextDouble();
				break;

			} catch (Exception e) {
				valid= false;
				scan.nextLine();
			}

		}

		DessertItem sundae = new Sundae(inputIceCreamType, scoopAmount, pricePerScoop, inputSundaeType, toppingPrice);
		return sundae;

	}// end of userPromptSundae()

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order runOrder = new Order();

		Scanner sIn = new Scanner(System.in);
		String choice;
		DessertItem orderItem;

		boolean done = false;
		while (!done) {
			System.out.println("\n1: Candy");
			System.out.println("2: Cookie");
			System.out.println("3: Ice Cream");
			System.out.println("4: Sunday");

			System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
			choice = sIn.nextLine();

			if (choice.equals("")) {
				done = true;
			} else {
				switch (choice) {
				case "1":
					orderItem = userPromptCandy();
					runOrder.Add(orderItem);
					break;
				case "2":
					orderItem = userPromptCookie();
					runOrder.Add(orderItem);
					break;
				case "3":
					orderItem = userPromptIceCream();
					runOrder.Add(orderItem);
					break;
				case "4":
					orderItem = userPromptSundae();
					runOrder.Add(orderItem);
					break;
				}// end of switch (choice)
			} // end of if (choice.equals(""))
		} // end of while (!done)
		System.out.println("\n");

		/*DessertItem addCandy = new Candy("Candy Corn", 1.5, .25);
		DessertItem addCandy1 = new Candy("Gummy Bears", .25, .35);
		DessertItem addCookie = new Cookie("Chocolate Chip", 6, 3.99);
		DessertItem addIceCream = new IceCream("Pistachio", 2, .79);
		DessertItem addSundae = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
		DessertItem addCookie1 = new Cookie("Oatmeal Raisin", 2, 3.45);
		runOrder.Add(addCandy);
		runOrder.Add(addCandy1);
		runOrder.Add(addCookie);
		runOrder.Add(addIceCream);
		runOrder.Add(addSundae);
		runOrder.Add(addCookie1);
		*/

		System.out.println(runOrder.toString());
		/*
		 * for (int i = 0; i < runOrder.getOrderList().size(); i++) { String output1 =
		 * String.format("%-25s$%-8.2f[Tax: $%.2f]\n",
		 * runOrder.getOrderList().get(i).getName(),
		 * runOrder.getOrderList().get(i).calculateCost(),
		 * runOrder.getOrderList().get(i).calculateTax()); System.out.println(output1);
		 * } // end of print out for loop double totals = runOrder.orderCost() +
		 * runOrder.orderTax();
		 * System.out.println("----------------------------------------------" + "\n");
		 * String output2 = String.format("%-25s$%-8.2f[Tax: $%.2f]\n",
		 * "Order Subtotals: ", runOrder.orderCost(), runOrder.orderTax());
		 * System.out.println(output2); String output3 =
		 * String.format("%-25s$%-8.2f\n\n", "Order Total: ", totals);
		 * System.out.print(output3);
		 * System.out.println("Total number of items in order: " +
		 * runOrder.itemCount());
		 */

	}// end of main

}// end of dessert shop class
