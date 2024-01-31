/* [주말 연습문제] 로또 게임
7개의 크기를 갖는 배열을 생성하고
1~46까지의 정수난수를 발생시켜 초기화 한다.

사용자는 로또 내의 숫자를 맞추어 1등~5등, 그리고 낙첨 여부를 출력하는 프로그램을 작성하시오

1) 로또번호는 프로그램이 시작되면 바로 발생됨
2) 사용자한테 물어봄.
   (몇번 하실래요? 3 ==> 3행)
   (직접 기입할 것인지? 컴퓨터가 발생한 숫자를 로또번호로 사용할 것인지
    물어보고 각각 다르게 처리할 것)
 */
import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] lottoAry = new int[7]; // 7개의 크기를 갖는 배열 생성
		int times;
		String choice;
		
		// 1~46까지의 정수 난수를 발생시켜 초기화
		for(int i=0; i<lottoAry.length; i++) {
			lottoAry[i] = (int)(Math.random() * 46 + 1); 
			for(int j=0; j<i; j++) {
				if(lottoAry[i] == lottoAry[j]) {
					--i;
					break;
				}
			}
		}
		
		System.out.print("몇 번 하시겠습니까? ");
		times = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("자동 / 수동 선택 : ");
		choice = scanner.nextLine();
		
		// 사용자 선택 번호 배열
		int [][] user = new int[times][7];
		
		int cnt = 0;
		// 자동 선택시
		if (choice.equals("자동")) {
			//자동으로 컴퓨터가 난수 설정
			for (int i=0; i<user.length; i++) {
				for(int j=0; j<user[i].length; j++) {
					user[i][j] = (int)(Math.random() * 46 + 1); 
					for(int k=0; k<j; k++) {
						if(user[i][j] == user[i][k]) {
							--j;
							break;
						}
					}
				}
			}
			
			// 정답과 비교하기
			for (int i=0; i<user.length; i++) {
				for(int j=0; j<user[i].length; j++) {
					if(user[i][j] == lottoAry[j]) {
						cnt += 1;
					}// end of if
				}
				System.out.println("사용자 선택: " + Arrays.toString(user[i]));
				System.out.println("정           답: " + Arrays.toString(lottoAry));
				System.out.printf("%d개 맞췄습니다 !\n",cnt);
				System.out.println();
			}
			
			
		}// end of if

		// 수동으로 입력 
		if (choice.equals("수동")) {
			for (int i=0; i<user.length; i++) {
				for(int j=0; j<user[i].length; j++) {
					System.out.print("번호를 입력하세요: ");
					user[i][j] = scanner.nextInt();
				}
				System.out.println(Arrays.toString(user[i]));
			}
			
			// 정답과 비교 
			for (int i=0; i<user.length; i++) {
				for(int j=0; j<user[i].length; j++) {
					if(user[i][j] == lottoAry[j]) {
						cnt += 1;
					}// end of if
				}
				System.out.println("사용자 선택: " + Arrays.toString(user[i]));
				System.out.println("정           답: " + Arrays.toString(lottoAry));
				System.out.printf("%d개 맞췄습니다 !\n",cnt);
				System.out.println();
			}
			
		} // end of if
		
	   scanner.close();
		
	}

}
