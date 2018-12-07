package oopFinalProject;


/**
 describes the product
 * @author Brix Andre Castro
 *@date 12/7/2018
 *@version 1
 */
public class LineItem {
	
	private int qty;
	private Product theProduct;
	
	/**
	 * constructor
	 */
	public LineItem() {
		qty = 0;
		theProduct = new Product();
	}
	
	/**
	 * constructor for initialization
	 * @param p - the product
	 * @param q - the amount
	 */
	public LineItem(Product p, int q)	{
		qty = q;
		theProduct = p;
	}
	
	/**
	 * prints the product and quantity
	 */
	public String toString()	{
		return "Product: "+theProduct+" Quantity: "+qty;
	}
	
	/**
	 * to make it easier for me, function for calculating total cost
	 * @return - returns total cost
	 */
	public double getTotalPrice()	{
		return theProduct.getPrice()*qty;
	}

}
