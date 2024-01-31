import java.util.Scanner;

public class InputBufferTest {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		//		int i;
		//		while(true) {
		//			System.out.print("값 입력: ");
		//			i = keyin.nextInt(); // 키보드로 직접 데이터를 받아오는 것이 아니라 입력 버퍼에서 데이터를 받아옴
		//			System.out.println("입력한 값==> " + i);
		//			keyin.nextLine(); // 첫번째 값만 입력받고 뒤에 버퍼에 남은 값은 날려서 버퍼 비우기, 버퍼 비워져서 다시 입력받을 수 있음
		//		}

		//		String data;
		//		while(true) {
		//			System.out.print("입력: ");
		//			data = keyin.next(); // 여러개 입력 시 스페이스 기준으로 나눠서 반복, 단어만 입력받음
		//			// data = keyin.nextLine(); // 줄단위로 입력받음, 띄어쓰기도 문자열로 인식; 버퍼에 있는 모든 값을 가져옴, 입력버퍼가 비워짐
		//			System.out.println("입력한 값 -> " + data);
		//		}

		String data;
		
		//단어 입력받기
		System.out.print("입력-1: "); // 단어 + 엔터(\r\n) 엔터로 버퍼로 올림
		//data = keyin.nextLine(); // nextLine을 앞에 입력시 버퍼에 남김없이 모든 데이터를 가져옴
		data = keyin.next(); // 단어만 입력받아 white space는 무시하고 출력사용
		System.out.println("입력한 값 1 -> " + data);
		
		//문장 입력받기
		System.out.print("입력-2: "); 
		data = keyin.nextLine(); // 맨 앞에 있는 엔터 무시하지 않고, 앞의 작업에서 남아있던 엔터를 출력에 사용
		//data = keyin.next(); 
		System.out.println("입력한 값 2 -> " + data);
		
		System.out.println("End");
		
		keyin.close();
	}

}
// ctrl+a  +  ctrl+i --> 전체 indent 맞추기

// inputbuffer
// buffer는 입력시 생기는 메모리 공간(임시기억장치), Queue(FIFO)의 형태로 운영, 
/*
 * <첫번 째 코드 결과>
값 입력: 5 6 7
입력한 값==> 5
값 입력: 입력한 값==> 6
값 입력: 입력한 값==> 7
 * 
 * 키보드로 여러값을 입력받아 엔터키 (5 6 7 엔터) -> 5 6 7이 버퍼로 들어감
 * 5가 변수에 채워지고 출력, 스페이스는 white space로 무시하고,
 * 값입력말 출력, 키보드 입력 따로 안받고 6이 변수를 채움.. 버퍼가 비워질때까지 반복
 */

/* <두번째 코드 결과>
입력: 10 abc 42.195
입력한 값 -> 10
입력: 입력한 값 -> abc
입력: 입력한 값 -> 42.195
 */


