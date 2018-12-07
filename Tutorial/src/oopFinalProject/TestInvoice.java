package oopFinalProject;

import java.text.DecimalFormat;

public class TestInvoice {
	static DecimalFormat formatter = new DecimalFormat("#0.00");     
	public static void main(String[] args) {


		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run

		
		//invoice run 1
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		Customer MoonMan = new Customer("The Moon", "MoonMan", 123500.0);
		Invoice MoonManInvoice = new Invoice(MoonMan);
		MoonManInvoice.addToOrder(new Product("Moon",150.0), 1);
		MoonManInvoice.addToOrder(new Product("Rovers", 50.0),5);
		MoonManInvoice.addToOrder(new Product("Satellites",100.0),10);
		
		runInvoice(MoonMan,MoonManInvoice); //runs invoice
		//invoice run 3
		Customer Jumpage = new Customer("Volcano", "Jumpage", 1000.0);
		Invoice JumpageInvoice = new Invoice(Jumpage);
		JumpageInvoice.addToOrder(new Product("Rocket Boots",2000), 3);
		JumpageInvoice.addToOrder(new Product("Gauntlet Thruster", 200.0),2);
		JumpageInvoice.addToOrder(new Product("Power Cores",50.0),3);
		
		runInvoice(Jumpage,JumpageInvoice); //runs invoice
		//invoice run 4
		Customer Bradley = new Customer("Corral Springs", "Dr Rad Brad the Mad", 3000.0);
		Invoice BradleyInvoice = new Invoice(Bradley);
		BradleyInvoice.addToOrder(new Product("Acid Bombs",200.0), 5);
		BradleyInvoice.addToOrder(new Product("Death Ray", 1000.0),1);
		BradleyInvoice.addToOrder(new Product("Platypus",20.0),50);
		
		runInvoice(Bradley,BradleyInvoice); //runs invoice
	}//end main
	
	//do not modify code below
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + formatter.format(c.getEvilFunds()));
			i.printInvoice();
		}
		
		
	}//end runInvoice

}//end TestInvoice
