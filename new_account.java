package lab9;

import java.util.LinkedList;
import java.util.Queue;

public class new_account implements Banking_system{
	
	public void print() {
		Queue<String> q = new LinkedList<String>();
		q.add("Account001");
		q.add("Account002");
		q.add("Account003");
		q.add("Account004");
		System.out.println("Following are the New bank Accounts");
		System.out.print(q);


}
}
