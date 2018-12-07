package oopFinalProject;

import java.text.DecimalFormat;


public class Customer {
	
	private String secretLairLocation;
	private String name;
	private double evilFunds;
	DecimalFormat formatter = new DecimalFormat("#0.00");
	
	/**
	 * the constructor
	 */
	public Customer()	{
		secretLairLocation = "none";
		name = "none";
		evilFunds = 0;
	}
	
	/**
	 * the constructor for initialization
	 * @param n - the name of the villain
	 * @param base - the secret base of the villain
	 * @param d - the amount of funds
	 */
	public Customer(String n, String base, double d)	{
		name = n;
		secretLairLocation = base;
		evilFunds = d;
	}
	
	/**
	 * returns name and secret lair location and evilfunds as a string
	 */
	public String toString()	{
		return "Name: "+name+" Lair "+secretLairLocation+" EvilFunds: "+formatter.format(evilFunds);
	}
	
	/**
	 * adds funds to total funds of villain
	 * @param add - amount that will add
	 * @return - returns the new total
	 */
	public double addFunds(double add)	{
		return evilFunds+=add;
	}
	
	/**
	 * gets evil funds
	 * @return - returns the evilfunds
	 */
	public double getEvilFunds() {
		return evilFunds;
	}

}
