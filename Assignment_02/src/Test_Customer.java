
public class Test_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Class Object
		Customer customer=new Customer(1,"Test Customer",10);
				
		//Test getID method
		System.out.println("Customer ID :"+customer.getID());
				
		//Test getName method
		System.out.println("Customer Name :"+customer.getName());
				
		//Test getDiscount method
		System.out.println("Customer Discount :"+customer.getDiscount());
				
		//Test toString method
		System.out.println("Customer Details :"+customer.toString());
				
		//Test setDiscount method
		customer.setDiscount(20);
		System.out.println("Customer Discount :"+customer.getDiscount());
				
	}

}
