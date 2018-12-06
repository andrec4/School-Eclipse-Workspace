package oopFinalProject;
import java.text.DecimalFormat;
import java.util.ArrayList;

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
	 * 
	 * @param c
	 */
	public Invoice(Customer c) {
		theCustomer = c;
	}
	
	public void addToOrder(Product p,int qty)	{
		LineItem item = new LineItem(p,qty);
		items.add(item);
	}
	
	
	
	public double amountDue()	{
		double total = 0;
		for (int i = 0;i<items.size();i++)	{
			LineItem productPrice = items.get(i);
			total+=productPrice.getTotalPrice();
		}
		return total;
	}
	
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


