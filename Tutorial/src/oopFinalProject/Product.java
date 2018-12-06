package oopFinalProject;

import java.text.DecimalFormat;

public class Product {
	
	private String name;
	private double price;
	DecimalFormat formatter = new DecimalFormat("#0.00");     
	
	public Product()	{
		name = "none";
		price = 0.0;
	}
	
	public Product(String n, double p)	{
		name = n;
		price = p;
	}
	
	public String toString()	{
		return "Name: "+name+" Price: "+formatter.format(price);
	}
	
	public double getPrice() {
		return price;
	}

}
