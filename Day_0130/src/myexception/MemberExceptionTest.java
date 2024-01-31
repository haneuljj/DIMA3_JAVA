package myexception;

import java.util.Scanner;

public class MemberExceptionTest {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String userID;
		
		while(true) {
			System.out.print("아이디를 2~5자 이내로 입력 : ");
			userID = keyin.next();
			
			try {
				if(userID.length() < 2 || userID.length() > 5) {
					throw new MemberException("아이디를 2~5자 이내로 입력하세요!");
				} else {
					System.out.println("사용가능한 아이디입니다");
					keyin.close();
					break;
				}
			} catch(MemberException e) {
				System.out.println(e.getMessage());
				keyin.nextLine(); //**
				continue;
			}
			
		}
	}

}
