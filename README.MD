Lab 4b: Dessert Shop, Part 4---User Interface
===========================================

**Follow the CS 115 Formatting Guide, which is found in the CS 115 Course Information module.**

Getting credit for this assignment requires two steps:

1.  Submit your finished code by clicking **Start Assignment** at the top of the page. Then upload your assignment using the**Choose File** option at the bottom of the page and click **Submit Assignment**. Include any comments you may wish the teacher to see when grading your assignment.  
2.  You **MUST pass off** the lab with the TA or tutor during their office hours (their information is in the "CS 115 Course Information" section of the Class Resources module) or with the teacher in class.

**Read the instructions carefully.** Not following the instructions will result in not getting credit for the assignment.\
**Make sure your output matches the Example Run.**

Objectives:
===========

In this lab, you will learn how to do the following:

-   Include a user interface with your class structure.

Structure:
==========

Update the following classes for this lab.

-   **Package Name: DessertShop**
-   **Class Names:**
    -   **DessertShop**

Program: Dessert Shop, Part 4
=============================

In this lab, you will add a user interface to the Dessert Shop application.

To do this, you will make updates to your Dessert Shop classes as described below:

### DessertShop Class:

-   Create four new methods in the DessertShop class:

-   private static DessertItem userPromptCandy()

-   private static DessertItem userPromptCookie()
-   private static DessertItem userPromptIceCream()
-   private static DessertItem userPromptSundae()

-   For each of these methods, you will need to:
    -   Create a Scanner object to take user input in the form of Strings or simply pass the Scanner in from main().
        -   If you create new Scanners for each method, be sure to close them before leaving the method.
        -   If you use the Scanner passed in from main(), do not close it inside the methods.
    -   Ask the user for the appropriate information to create each item.
    -   Convert any numbers entered from string to the appropriate data type (int or double).
    -   Use input validation to ensure the user entered numbers when asked to do so.
    -   Store that information in appropriate variables local to the methods.
    -   Instantiate an object of the appropriate type (class) populating the arguments of the constructors with the data you just received from the user.
    -   Return the newly created object back to where it was called in main().

-   Add the following lines of code to your main() method exactly as written (copy/paste into your program). This should be placed near the top of your main() method, right after you instantiate the order object and before you start adding the items to the order.

public static void main(String[] args) {                                                 //already in your program\
Order order1 = new Order();                                                                   //already in your program

 **<Paste code below here>**

Candy candy1 = new Candy("Candy Corn", 1.5, .25);              //already in your program\
order1.add(candy1);                                                                               //already in your program

Candy candy2.........                                                                                 //already in your program

------Begin Copy-----

**Scanner sIn = new Scanner(System.in);    **\
**String choice;**\
**DessertItem orderItem;**

**boolean done = false;**\
**while (!done) {**\
**    System.out.println("\n1: Candy");**\
**    System.out.println("2: Cookie");            **\
**    System.out.println("3: Ice Cream");**\
**    System.out.println("4: Sunday");**

**    System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");**\
**    choice = sIn.nextLine();**

**    if (choice.equals("")) {**\
**        done = true;**\
**    } else {**\
**        switch (choice) {**\
**            case "1":            **\
**                orderItem = userPromptCandy();**\
**                order1.add(orderItem);**\
**                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());**\
**                break;**\
**            case "2":            **\
**                orderItem = userPromptCookie();**\
**                order1.add(orderItem);**\
**                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());**\
**                break;**\
**            case "3":            **\
**                orderItem = userPromptIceCream();**\
**                order1.add(orderItem);**\
**                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());**\
**                break;**\
**            case "4":            **\
**                orderItem = userPromptSundae();**\
**                order1.add(orderItem);**\
**                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());**\
**                break;**\
**            default:            **\
**                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");**\
**                break;**\
**        }//end of switch (choice)**\
**    }//end of if (choice.equals(""))**\
**}//end of while (!done)**\
**System.out.println("\n");**

------End Copy-----

### DessertItem class:

-   No changes

### All subclasses (Candy, Cookie, IceCream, Sundae):

-   No changes

JUnit Test Cases:
=================

Regression-test your code:

Re-execute your test cases to ensure that all test cases still pass. You do not need to create any new test cases for this lab.

Key Program Requirements:
=========================

A user interface has been added to your Dessert Shop program.

The output of running your Dessert Shop program should be formatted and look similar to the Example Run.

Turn in seven (7) .java files:

-   DessertShop.java
-   Order.java
-   DesertItem.java
-   Candy.java
-   Cookie.java
-   IceCream.java
-   Sundae.java

Example Run:
============

1: Candy\
2: Cookie\
3: Ice Cream\
4: Sunday

What would you like to add to the order? (1--4, Enter for done): 2\
Enter the type of cookie: Chocolate Chip Macadamia\
Enter the quantity purchased: 5\
Enter the price per dozen: 4.99

1: Candy\
2: Cookie\
3: Ice Cream\
4: Sunday

What would you like to add to the order? (1--4, Enter for done): 3\
Enter the type of Ice Cream used: Mint Chocolate Chip\
Enter the number of scoops: 4\
Enter the price per scoop: .89

1: Candy\
2: Cookie\
3: Ice Cream\
4: Sunday

What would you like to add to the order? (1--4, Enter for done):4

Enter the type of Ice Cream: Vanilla\
Enter the number of scoops: 3\
Enter the price per scoop: .89\
Enter the kind of topping used: Sprinkles\
Enter the price for the topping: .5

1: Candy\
2: Cookie\
3: Ice Cream\
4: Sunday

What would you like to add to the order? (1--4, Enter for done): 

Chocolate Chip Macadamia               $2.08            [Tax: $0.15]

Mint Chocolate Chip                           $3.56             [Tax: $0.26]

Sprinkles Vanilla Sunday                     $3.17             [Tax: $0.23]

Candy Corn:                                         $0.38              [Tax: $0.03]

Gummy Bears:                                     $0.09              [Tax: $0.01]\
Chocolate Chip:                                  $2.00               [Tax: $0.14]\
Pistachio:                                             $1.58               [Tax: $0.11]\
Vanilla:                                                 $3.36               [Tax: $0.24]\
Oatmeal Raisin:                                  $0.58               [Tax: $0.04]\
--------------------------------------------------------------------------------\
Order Subtotals:                                 $16.77             [Tax: $1.21]\
Order Total:                  $18.01\
Total items in the order: 9