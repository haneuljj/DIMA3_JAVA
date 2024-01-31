// 문제
// 'a' ~ 'z'까지 반복문 for를 이용하여 출력하시오
public class ForTest02 {

	public static void main(String[] args) {
		// 문자형도 정수형처럼 증감 가능, char값도 정수형이기때문
		for(int i = 0; i<10; ++i)  { // 이중 for문
			for(char ch = 'a'; ch <= 'z'; ++ch) 
				System.out.print(ch);
		
			System.out.println();
		}
	}

}
