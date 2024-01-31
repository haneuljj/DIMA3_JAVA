import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		// x와 y의 값을 바꾸기
		/* int x = 10;
		int y = 20;
		int temp; // 바꾸기 위해 담을 빈 변수
		
		System.out.println("변경 전: x = " + x + ", y = " + y);
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("변경 후: x = " + x + ", y = " + y);
		*/
		
//		x에 큰값이 들어가도록 출력하시오
		int x, y, temp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 개의 정수값을 입력하세요 => ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		// 여러 숫자 입력시, 한꺼번에 여러개 입력시, 숫자를 enter, tab, space(white space)로 구분
		
		
		// if문 작성: if(조건문){조건문을 만족하면 실행할 문장}
		if(x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println("x = " + x + ", y = " + y);
		
		
		// 문제 2) 키보드로부터 서로 다른 3개의 정수값을 입력
		int max, median, min;
		
		// 입력
		System.out.print("세 개의 정수값을 입력하세요 => ");
		max = scanner.nextInt();
		median = scanner.nextInt();
		min = scanner.nextInt();
		
		// 처리(데이터 순서에 맞게 변경)
		if((max > median) && (max > min) && (median < min)) {
			temp = median;
			median = min;
			min = temp;
		}
		
		if((median > max) && (median > min)) {
			temp = max;
			max = median;
			median = temp;
			if(median < min) {
				temp = median;
				median = min;
				min = temp;
			}
		}
		
		if((min > max) && (min > median)) {
			temp = max;
			max = min;
			min = temp;
			if(median < min) {
				temp = median;
				median = min;
				min = temp;
			}
		}
		
		// 출력
		System.out.println("최대 = " + max + ", 중간 = " + median + ", 최소 = " + min);
		
		scanner.close();
	}

}
