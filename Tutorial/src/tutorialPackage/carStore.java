package tutorialPackage;
import java.util.Scanner;

//Tesla Roadster = $257 000
//Honda Civic Type R = $33 900
//Bugatti Chiron = $3 000 000

public class carStore {
	
	//Used to calculate tax
	public static double calculateTax(double price)	{
		final double TAX = 0.05;
		double taxAmount = price*TAX;
		return taxAmount;
	}
	//Used to calculate price with tax
	public static double calculations(int quantity, double cost)	{
			double price = 0;
			price = quantity*cost;
			return price = price+calculateTax(price);
	}
	
	//The main method that starts up
	public static void startUp()	{
		//Variables for the choices
		int buyAgain = 0;
		int whileLoop = 0;
		//Variables for the receipt
		int totalQuantity = 0;
		int roadsterQuantity = 0;
		int civicQuantity = 0;
		int chironQuantity = 0;
		//variables for cost and tax
		double carCost = 0;
		double totalCost = 0;
		double totalTax = 0;
		//Scanners
		Scanner scStr = new Scanner( System.in );
		Scanner scNum = new Scanner( System.in );		
		System.out.println("Hello! Welcome to Andre's Borderline Legal Vehicles");
		//The loop to buy the cars and add tax
		while (whileLoop == 0)	{
			System.out.println("What would you like to buy?"
				+ "\n1. Tesla Roadster = $257 000"
				+ "\n2. Honda Civic Type R = $33 900"
				+ "\n3. Bugatti Chirron = $3 000 000");
			//This determines their car choice
			System.out.println("What car would you like?");
			int carChoice = scNum.nextInt();
			//Asks how many you would like
			System.out.println("How many would you like?");
			int carQuantity = scNum.nextInt();
			//Decides  the course of action
			if (carChoice == 1)	{
				//calculates cost, adds to the quantity receipt, adds to tax adds to total cost
				carCost = calculations(carQuantity, 257000);
				totalQuantity += carQuantity;
				roadsterQuantity += carQuantity;
				totalCost += carCost;
				totalTax += calculateTax(carQuantity*257000);
				//Asks if you would like to buy again
				System.out.println("Would you like to buy anything else?\n1. Yes 2. No"); 
				buyAgain = scNum.nextInt();
				if (buyAgain == 1)	{
					
				}
				else if	(buyAgain == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option.");
				}
				
			}
			else if (carChoice == 2)	{
				//calculates cost, adds to the quantity receipt, adds to tax adds to total cost
				carCost = calculations(carQuantity, 33900);
				totalQuantity += carQuantity;
				civicQuantity += carQuantity;
				totalCost += carCost;
				totalTax += calculateTax(carQuantity*257000);
				//Asks if you would like to buy again
				System.out.println("Would you like to buy anything else?\n1. Yes 2. No"); 
				buyAgain = scNum.nextInt();
				if (buyAgain == 1)	{
					
				}
				else if	(buyAgain == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option.");
				}
			}
			else if (carChoice == 3)	{
				//calculates cost, adds to the quantity receipt, adds to tax adds to total cost
				carCost = calculations(carQuantity, 3000000);
				totalQuantity += carQuantity;
				chironQuantity += carQuantity;
				totalCost += carCost;
				totalTax += calculateTax(carQuantity*257000);
				//Asks if you would like to buy again
				System.out.println("Would you like to buy anything else?\n1. Yes 2. No"); 
				buyAgain = scNum.nextInt();
				if (buyAgain == 1)	{
					
				}
				else if	(buyAgain == 2)	{
					break;
				}
				else	{
					System.out.println("Not a valid option.");
				}
			}
			else	{
				System.out.println("Not a valid option.");
			}
		}
		//Prints the quantity of each car, the total tax and the total cost
		System.out.printf("\nChiron: " + chironQuantity
				+ "\nRoadster : " + roadsterQuantity
				+ "\nCivic : " + civicQuantity
				+ "\nThe total tax is: $%.2f" , totalTax);
		System.out.printf("\nThe total cost is: %.2f", totalCost);
	}
	
	public static void main(String[] args) {
		//Starts everything
		startUp();
	}
}