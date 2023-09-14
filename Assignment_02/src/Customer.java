
public class Customer {

	//initializing class variables
	private int ID;
	private String name;
	private int Discount;
	
	//Customer class constructor
	public Customer(int ID, String name, int Discount) {
		this.ID=ID;
		this.name=name;
		this.Discount=Discount;
		
	}
	
	//getID method
	public int getID() {
		return this.ID;
	}
	
	//getName method
	public String getName() {
		return this.name;
	}
	
	//getDiscount method
	public int getDiscount() {
		return this.Discount;
	}
	
	//setDiscount method
	public void setDiscount(int discount) {
		this.Discount=discount;
	}
	
	//toString method
	public String toString() {
		return this.name+"("+this.Discount+")";
	}
}
