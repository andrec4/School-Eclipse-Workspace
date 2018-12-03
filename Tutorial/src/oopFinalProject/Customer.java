package oopFinalProject;

public class Customer {
	
	private String secretLairLocation;
	private String name;
	private int evilFunds;
	
	public Customer()	{
		secretLairLocation = "none";
		name = "none";
		evilFunds = 0;
	}
	
	public Customer(String n, String base, int money)	{
		name = n;
		secretLairLocation = base;
		evilFunds = money;
	}
	
	public String toString()	{
		return "Name: "+name+" Lair "+secretLairLocation+" EvilFunds: "+evilFunds;
	}
	
	public int addFunds(int add)	{
		return evilFunds+=add;
	}

}
