package oopFinalProject;

public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	public LineItem() {
		qty = 0;
		theProduct = new Product();
	}
	
	public LineItem(int q, Product p)	{
		qty = q;
		theProduct = p;
	}
	
	public String toString()	{
		return "Product: "+theProduct+" Quantity: "+qty;
	}

}
