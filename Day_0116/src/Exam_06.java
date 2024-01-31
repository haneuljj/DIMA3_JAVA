import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// [문제-1] 키보드로부터 정수값에 해당하는 초 단위의 값을 입력받아
		// 시, 분, 초 단위로 환산하여 출력하는 프로그램을 작성
		int hrs, mins, sec;
		
		Scanner keyin = new Scanner(System.in);
		System.out.print("시간을 초 단위로 입력하세요: ");
		int user_sec = keyin.nextInt();
		
		hrs = user_sec / 3600;
		mins = (user_sec % 3600) / 60;
		sec = (user_sec % 3600) % 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", user_sec, hrs, mins, sec);
		
		keyin.close(); 
	}

}
