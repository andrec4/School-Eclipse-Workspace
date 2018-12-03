package oopFinalProject;

public class Product {
	
	private String name;
	private double price;
	
	public Product()	{
		name = "none";
		price = 0.0;
	}
	
	public Product(String n, double p)	{
		name = n;
		price = p;
	}
	
	public String toString()	{
		return "Name: "+name+" Price: "+price;
	}

}
