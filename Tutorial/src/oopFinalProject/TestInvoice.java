package oopFinalProject;

public class TestInvoice {
	public static void main(String[] args) {

		// create 3 additional invoice runs
		// add at least 5 items to invoice order for each invoice run
// make sure in at least one of the runs the customer can not afford the purchase
		
		//invoice run 1
		Customer c = new Customer("island", "Dr evil", 1230.0);
		Invoice in = new Invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		
		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		
		//invoice run 3
		
		//invoice run 4
		
	}//end main
	
	//do not modify code below
	public static void runInvoice(Customer c, Invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + c.getEvilFunds());
		}
		
		i.printInvoice();
	}//end runInvoice

}//end TestInvoice
