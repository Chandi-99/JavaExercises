
public class Test_Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Customer object
		Customer customer=new Customer(1,"Test Customer",10);
				
		//Test constructor 
		Invoice invoice1=new Invoice(1,customer,1000.00);
				
		//Test setCustomer method
		invoice1.setCustomer(customer);
						
		//Test getID method
		System.out.println("Invoice ID :"+invoice1.getID());
				
		//Test getCustomer method
		System.out.println("Customer :" + customer.toString());
				
		//Test setAmount method
		invoice1.setAmount(2000);
		
		//Test getCustomerName method
		System.out.println("Customer Name :"+ invoice1.getCustomerName());
		
		//Test getAmount method
		System.out.println("Amount before discount :"+invoice1.getAmount());
		
		//Test getAmountAfterDiscount method
		System.out.println("Amount After Discount :" + invoice1.getAmountAfterDiscount());
	}

}
