package mypackage2;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌주명 입력: ");
		bankaccount.setName(scanner.nextLine());
		
		System.out.print("계좌번호 입력: ");
		bankaccount.setNo(scanner.nextLine());
		
		bankaccount.setBalance(0);
		
		String menu;
		while(true) {
			System.out.println("=============");
			System.out.println("0. 종료");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고 확인");
			System.out.println("=============");
			
			System.out.print("선택: ");
			menu = scanner.next();
			
			if (menu.equals("0")) {
				System.out.println("프로그램 종료");
				scanner.close();
				return;
			}
			
			else if (menu.equals("1")) {
				System.out.println("금액 입력: ");
				bankaccount.deposit(scanner.nextInt());
				bankaccount.output();
			}
			
			else if (menu.equals("2")) {
				System.out.print("금액 입력: ");
				bankaccount.withdraw(scanner.nextInt());
				bankaccount.output();
			}
			
			else if (menu.equals("3")) {
				bankaccount.output();
			}
			
			else {
				System.out.println("잘못된 입력");
				continue;
			}
		} // end while
	} // end main()

}
