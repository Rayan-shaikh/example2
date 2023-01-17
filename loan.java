package lab9;
import java.util.Stack;



public class loan implements Banking_system  {
	static void stack_push(Stack<Integer> S) {
		for(int i = 1; i <= 4; i++) {
			S.push(i);
		}
	}
	static void stack_pop(Stack<Integer> S) {
System.out.println("List of Customer's Deadline of loan ");
		int j = 1;
		for(int i = 1; i <= 4; i++) {
			Integer y = (Integer) S.pop();
System.out.println("Customer " + y + " Has " + j*4 + " Month Left.");
			j++;
		} 
	}
	static void stack_peek(Stack<Integer> S) {
		Integer element = (Integer) S.peek();
System.out.println("\nCustomers Expire Extension Limit \nCustomer : " + element);
	}
	public void print() {
System.out.println("\n======Customer who took Loan=====\n");
		Stack<Integer> S = new Stack<Integer>();
		stack_push(S);
		stack_pop(S);
		stack_push(S);
		stack_peek(S);
	}


}
