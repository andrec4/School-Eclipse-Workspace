package oopFinalProject;
import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * the invoice
 * @author Brix Andre Castro
 * @date 12/7/2018
 * @version 1 
 */
public class Invoice {

	private ArrayList<LineItem> items = new ArrayList<LineItem>();
	private Customer theCustomer;
	DecimalFormat formatter = new DecimalFormat("#0.00");     
	
	/**
	 * The constructor
	 */
	public Invoice()	{
	//items = new ArrayList<LineItem>();
	theCustomer = new Customer();
	}
	
	/**
	 * To initialize values in constructor
	 * @param c - the customer
	 */
	public Invoice(Customer c) {
		theCustomer = c;
	}
	
	/**
	 * function to add to item array list
	 * @param p - the product
	 * @param qty - the quantity/amount
	 */
	public void addToOrder(Product p,int qty)	{
		LineItem item = new LineItem(p,qty);
		items.add(item);
	}
	
	
	/**
	 * calculates and adds everything in the items array list
	 * @return - returns the total
	 */
	public double amountDue()	{
		double total = 0;
		for (int i = 0;i<items.size();i++)	{
			LineItem productPrice = items.get(i);
			total+=productPrice.getTotalPrice();
		}
		return total;
	}
	
	/**
	 * determines whether the customer has enough funds
	 * @param theCustomer - the customer
	 * @return - returns if can or cannot buy
	 */
	public boolean canAfford(Customer theCustomer)	{
		boolean x = false;
			if (theCustomer.getEvilFunds()>amountDue()) {
				x=true;
			}
			else	{
				x=false;
			}
		return x;
	}
	
	/**
	 * prints the invoice
	 */
	public void printInvoice()	{
		
		for (int i=0;i<items.size();i++) {
			System.out.println(items.get(i));
		}
		if (theCustomer.getEvilFunds()>=amountDue())	{
			System.out.println("Purchase Approved");
		}
		else if (theCustomer.getEvilFunds()<amountDue())	{
			System.out.println("Purchase Denied!");
			System.out.println("Short by: "+formatter.format((amountDue()-theCustomer.getEvilFunds())));
		}
	}
	
}


