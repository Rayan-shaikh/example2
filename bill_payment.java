package lab9;
import java.util.ArrayList;
import java.util.List;


public class bill_payment implements Banking_system{
	
	public void print(){
		List <String> customers = new ArrayList<String>();
		
		System.out.println("\n");
		System.out.println("=======Bill Payment=======");
		customers.add("Barira");
		customers.add("Esha");
		customers.add("Eshal");
		customers.add("Khurram");
		System.out.println("\nList of customers for payment:");
		System.out.println(customers);
		System.out.println("\nPending payments of  Customers");
		customers.remove(1);
		customers.remove(2);
		System.out.println(customers);		
	}


}
