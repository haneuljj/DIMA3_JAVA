import java.util.Scanner;

public class ExamAnswer_11 {

	public static void main(String[] args) {
		int max, median, min, temp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력: ");
		max = scanner.nextInt();
		median = scanner.nextInt();
		min = scanner.nextInt();
		
		//처리
		// max에 가장 큰 값이 들어가도록 max를 median과 min 값과 비교
		if(max < median) {
			temp = max;
			max = median;
			median = temp;
		}
		
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
		} // max에 가장 큰 값 넣기 완료 
		
		// min에 가장 작은 값이 들어가도록 min과 median 크기 비교
		if(median < min) {
			temp = median;
			median = min;
			min = temp;
		}
		
		// 출력
		System.out.println("최대 = " + max + ", 중간 = " + median + ", 최소 = " + min);
		
		scanner.close();
	} 

}
