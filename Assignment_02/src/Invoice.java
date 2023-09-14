
public class Invoice extends Customer{
	
	//initializing class variables
	private int ID;
	private double amount;
	private Customer customer=new Customer(1,"test customer name",10);
	
	//Invoice class constructor
	public Invoice( int ID, Customer customer,double amount) {
		super(customer.getID(),customer.getName(),customer.getDiscount());
		this.ID=ID;
		this.customer=customer;
		this.amount=amount;
	}
		
		//Create getID method
		public int getID() {
			return this.ID;
		}
		//Create getCustomer method
		public Customer getcustomer() {
			return this.customer;
		}
		
		//Create setCustomer method
		public void setCustomer(Customer customer) {
			this.customer=customer;
		}
		
		//Create getAmount method
		public double getAmount() {
			return this.amount;
		}
		
		//Create setAmount method
		public void setAmount(double amount) {
			this.amount=amount;
		}
		
		//Create getCustomerName method
		public String getCustomerName() {
			return this.customer.getName();
		}
		
		//Create getAmountAfterDiscount method
		public double getAmountAfterDiscount() {
			return this.amount-(this.amount*(this.customer.getDiscount())/100);
		}

}
