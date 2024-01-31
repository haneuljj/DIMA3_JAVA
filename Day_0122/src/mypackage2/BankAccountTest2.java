package mypackage2;

public class BankAccountTest2 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		
		b1.output();
		
		b1.setName("전하늘");
		b1.setNo("123");
		b1.setBalance(50000);
		
		b1.output();
		
		b1.deposit(15000);
		b1.output();
		
		b1.withdraw(30000);
		b1.output();
		
	    b1.withdraw(100000);
		b1.output();

	}

}
