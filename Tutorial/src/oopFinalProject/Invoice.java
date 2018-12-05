package oopFinalProject;
import java.util.ArrayList;

public class Invoice {

	private ArrayList<LineItem> items;
	private Customer theCustomer;
	
	public Invoice()	{
	items = new ArrayList<LineItem>();
	theCustomer = new Customer();
	}
	
	public Invoice(Customer c) {
		theCustomer = c;
	}
	
	public void addToOrder(Product p,int qty)	{
		LineItem item1 = new LineItem(p,qty);
		items.add(item1);
	}
	
	public void printInvoice()	{
		for (int i=0;i<items.size();i++) {
			System.out.println(items.get(i));
		}
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
	
}


