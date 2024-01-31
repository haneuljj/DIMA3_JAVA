/* 자바는 강형 언어로 데이터 저장하는 타입의 구분이 엄격
 * 변수를 사용하기 위해서는 !!변수의 타입을 선언 후 사용!!해야 함
 * 타입은 크게 기본형(primitive)과 참조형(reference)이 있음
 * 기본형: 고정된 길이의 메모리에 값을 표현, 더 이상 쪼갤 수 없는 기본 단위(수치형-정수형, 실수형 / 진위형), stack 공간의 변수에 값을 직접 지정
 * byte, short, int, long, char, float, double, boolean
 * 참조형: 기본형이나 다른 참조형을 조합하여 생성하는 타입, heap공간에 데이터를 저장하고 그 위치값을 이용해 데이터에 접근
 * class, interface, array, enum ... 
 * */

/* 정수형: byte, short(2byte), int(4byte, 연산의 기본 단위), long(8byte) */
/* 8비트의 경우
 * _000 0000 -> 부호비트(sign bit, MSB): 0이면 양수, 1이면 음수*/

/* MSB(Most Significant Bit): 부호비트; 음수인지 양수인지 결정하는 비트
 * LSB(Least Significant Bit):홀수인지 짝수인지 결정하는 비트
 */

/* 1)
 * 0001 1011 = 양수 27
 * 1001 1011 = 음수 27
 * 더해도 0이 안나옴, 부호 + 절대값의 표현 방식
 * 수의 표현은 가능하지만 연산이 불가능
 */

/* 2)
 * 0001 1011
 * 1110 0100
 * 더하면 1111 1111, 또 1을 더해야 0이 됨, 부호 + 1의 보수
 * 추가로 1을 더하는 작업을 해야함
 */

/* 3)
 * 부호 + 2의 보수: 컴퓨터에서 저장하고 연산시 현재 사용하는 방식
 * 0001 1011
 * 1110 0101  -> 1의 보수로 바꾼 후 미리 1을 더하는 방식
 */


public class SecondClass {

	public static void main(String[] args) {
		System.out.print("KITA DM 3기");
		System.out.println("2024년 1월 15일"); //ln;출력 후 줄바꿈 포함
		System.out.println("월요일"); // "":문자열
		System.out.println(); // 줄나누기
		System.out.println(42.195); // 실수 literal
		System.out.println(5 * 10); // 식
		System.out.println(true); // boolean literal
		System.out.println(5 > 10);
		System.out.println('강'); // '': 문자 literal; 한글자씩만
		System.out.println('♥');
		
	}

}
