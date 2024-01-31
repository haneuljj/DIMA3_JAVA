/*[문제-8] BMI지수 구하기

몸무게(kg)와
키(cm)를 입력 받아 BMI 지수를 구하여 출력하시오

1) Hint
BMI = 몸무게(kg) / 키(m)의 제곱
 */

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		double weight, height, bmi;
		Scanner keyin = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요(kg):");
		weight = keyin.nextInt();
		
		System.out.print("키를 입력하세요(cm):");
		height = keyin.nextInt();
		
		height = height / 100; 
		
		bmi = weight / (height * height);
		System.out.printf("bmi 지수: " + bmi);
		
		keyin.close();
		
	}

}
