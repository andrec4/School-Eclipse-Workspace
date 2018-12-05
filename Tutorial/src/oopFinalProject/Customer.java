package oopFinalProject;

public class Customer {
	
	private String secretLairLocation;
	private String name;
	private double evilFunds;
	
	public Customer()	{
		secretLairLocation = "none";
		name = "none";
		evilFunds = 0;
	}
	
	public Customer(String n, String base, double d)	{
		name = n;
		secretLairLocation = base;
		evilFunds = d;
	}
	
	public String toString()	{
		return "Name: "+name+" Lair "+secretLairLocation+" EvilFunds: "+evilFunds;
	}
	
	public double addFunds(double add)	{
		return evilFunds+=add;
	}
	
	public double getEvilFunds() {
		return evilFunds;
	}

}
