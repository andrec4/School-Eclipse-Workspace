package oopFinalProject;

import java.text.DecimalFormat;

/**
 * describes the product
 * @author Brix Andre Castro
 *@date 12/7/2018
 *@version 1
 */
public class Product {
	
	private String name;
	private double price;
	DecimalFormat formatter = new DecimalFormat("#0.00");     
	
	/**
	 * the constructor
	 */
	public Product()	{
		name = "none";
		price = 0.0;
	}
	
	/**
	 * contructor
	 * @param n - the name of product
	 * @param p - the price of product
	 */
	public Product(String n, double p)	{
		name = n;
		price = p;
	}
	
	/**
	 * returns the product as a string
	 */
	public String toString()	{
		return "Name: "+name+" Price: "+formatter.format(price);
	}
	
	/**
	 * gets price
	 * @return - returns price
	 */
	public double getPrice() {
		return price;
	}

}
