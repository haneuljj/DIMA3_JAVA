package ticket.main;

import ticket.vo.AdvanceTicket;
import ticket.vo.Ticket;
import ticket.vo.WalkupTicket;

public class TicketMain {

	public static void main(String[] args) {
		// Ticket t = new Ticket(); // 추상클래스 -> 객체 생성 불가
		
		WalkupTicket w = new WalkupTicket(101, 100000);
		System.out.println(w);
		
		AdvanceTicket a = new AdvanceTicket(10);
		System.out.println(a);
	}

}
