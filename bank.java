package lab9;

public class bank {

	public static void main(String[] args) {
		new_account account = new new_account();
		account.print();
		bill_payment  bill = new bill_payment ();
		bill.print();
		loan loan = new loan();
		loan.print();
	}

}
