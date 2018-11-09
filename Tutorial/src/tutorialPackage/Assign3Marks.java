package tutorialPackage;
import java.util.Scanner;

public class Assign3Marks {

	
	public static void start()	{
		Scanner sc = new Scanner(System.in);//the scanner
		String[] product = {"Tuna Sushi","Egg Sushi","Salmon Sushi","Eel Sushi","Spicy Roll",//array for the sushi
				"Tempura Roll","Cali Roll","Rainbow Roll","Dragon Roll","Octopus Roll"};
		double[] prices = {1,1.5,2,1,1.2,0.9,1.5,1,0.8,1.3};//the prices
		int[] quantity = new int[product.length];//the empty array
		double totalPrice = 0;//total price
		double DISCOUNT = 0;//initial discount
		while (true)	{
			for (int i = 0; i<prices.length;i++) {//prints the number,product and price
				System.out.println(i+". "+product[i]+"\t\t\t$"+prices[i]);
			}//end of for loop
			System.out.println("What would you like?");//asks for what product
			int sushiChoice = sc.nextInt();
			sc.nextLine();
			if (sushiChoice == -1)	{//for if the discount is applied, DISCOUNT is initialized to 0.9
				DISCOUNT = 0.9;
				System.out.println("You have entered the secret discount code! \nAll future purchases are now 10% off!");
				System.out.println("What would you like?");
				sushiChoice = sc.nextInt();//asks for another option
				sc.nextLine();
			}
			System.out.println("You want the "+product[sushiChoice]);
			System.out.println("How much of "+product[sushiChoice]+" would you like?");//asks for the quantity
			int amount = sc.nextInt();
			sc.nextLine();
			quantity[sushiChoice] = amount;//assigns the quantity to the empty array from earlier
			if (DISCOUNT == 0.9)	{//if the discount is applied
				System.out.println(amount+" "+product[sushiChoice]+" to $"+(amount*prices[sushiChoice])*DISCOUNT);
			}//end of if
			else	{//if the discount is not applied
				System.out.println(amount+" "+product[sushiChoice]+" to $"+amount*prices[sushiChoice]);
			}
			System.out.println("Would you like to buy anything else?\n1. Yes\n2. No");//asks if the users wants to do anything else
			int choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1)	{
			}
			else if (choice == 2)	{
				break;
			}
			else	{
				System.out.println("Invalid");
			}
		}//end of while
		System.out.println("Product\t\t\tPrice\t\tNum Bought\tTotal");//prints the categories
		for	(int i = 0;i<quantity.length;i++)	{//repeats until the end of quantity.length
			if (quantity[i] > 0)	{
				if (DISCOUNT == 0.9)	{//prints the product, price multiplied by the discount, the quantity, and the total of all
					System.out.println(product[i]+"\t\t"+(prices[i])*DISCOUNT+"\t\t"+quantity[i]+"\t\t$"+(prices[i]*DISCOUNT)*quantity[i]+" DISCOUNT APPLIED");
				}
				else if	(DISCOUNT == 0)	{//prints as before but without discounts
					System.out.println(product[i]+"\t\t$"+prices[i]+"\t\t"+quantity[i]+"\t\t"+prices[i]*quantity[i]);
				}
				if	(DISCOUNT == 0.9)	{//adds to the total price with discount
					totalPrice += (prices[i]*DISCOUNT)*quantity[i];
				}
				else if	(DISCOUNT == 0)	{//prints as before but without discount
					totalPrice += prices[i]*quantity[i];
				}
			}

		}//end of for
		System.out.println("Total\t\t\t$"+totalPrice);//prints the total price
	}//end of start()
	
		
	
	public static void main(String[] args) {
		start();//starts everything
	}//end of public static void

}//end class
