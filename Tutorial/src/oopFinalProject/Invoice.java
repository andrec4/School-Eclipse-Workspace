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
		LineItem item1 = new LineItem(qty,p);
		items.add(item1);
	}
	
	public void printInVoice()	{
		for (int i=0;i<items.size();i++) {
			System.out.println();
		}
	}
}


