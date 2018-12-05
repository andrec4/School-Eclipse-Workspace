package oopFinalProject;

public class Test {

	
	public static void main(String[] args)	{
		Product p = new Product("flame",189.0);
		System.out.println(p.toString());
		LineItem l = new LineItem(p,9);
		System.out.println(l.toString());
	}
}
